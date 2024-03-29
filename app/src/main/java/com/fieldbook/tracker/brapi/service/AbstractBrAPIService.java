package com.fieldbook.tracker.brapi.service;

import android.content.Context;
import android.util.Log;

import androidx.arch.core.util.Function;

import com.fieldbook.tracker.brapi.model.Observation;
import com.fieldbook.tracker.preferences.GeneralKeys;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class AbstractBrAPIService implements BrAPIService {


    private static final String TAG = AbstractBrAPIService.class.getName();

    public void createObservationsChunked(int chunkSize, List<Observation> observations, BrAPIChunkedUploadProgressCallback<Observation> uploadProgressCallback, Function<Integer, Void> failFn) {
        saveChunks(chunkSize, observations, uploadProgressCallback, failFn, this::createObservations);
    }

    public void updateObservationsChunked(int chunkSize, List<Observation> observations, BrAPIChunkedUploadProgressCallback<Observation> uploadProgressCallback, Function<Integer, Void> failFn) {
        saveChunks(chunkSize, observations, uploadProgressCallback, failFn, this::updateObservations);
    }

    private <T> void saveChunks(int chunkSize, List<T> items, BrAPIChunkedUploadProgressCallback<T> uploadProgressCallback, Function<Integer, Void> failFn, SaveChunkFunction<T> processFn) {
        List<List<T>> chunkedItemLists = createChunks(chunkSize, items);

        /*
         Allow for up to two parallel write calls to happen at a time.
         May be worth enhancing this to be more dynamic based on the device specs
         */
        Semaphore requestSemaphore = new Semaphore(2);
        AtomicBoolean failed = new AtomicBoolean(false);
        AtomicInteger completedChunks = new AtomicInteger(0);
        for (int chunkNum = 0; chunkNum < chunkedItemLists.size(); chunkNum++) {
            List<T> chunk = chunkedItemLists.get(chunkNum);
            int currentChunkNum = chunkNum+1;

            try {
                requestSemaphore.acquire();
            } catch (InterruptedException e) {
                Log.e(TAG, "Error getting semaphore", e);
                failFn.apply(0);
                failed.set(true);
            }

            //once a semaphore is acquired, check that there weren't any failures while waiting
            if(failed.get()) {
                return; //break out of the loop and don't let any more requests be sent.  This could be removed if the UI is updated to keep track of multiple failures
            }

            Log.d(TAG,"Starting chunk " + currentChunkNum + "/" + chunkedItemLists.size());
            processFn.apply(chunk, input -> {
                Log.d(TAG,"Finished chunk " + currentChunkNum + "/" + chunkedItemLists.size());
                uploadProgressCallback.apply(input, currentChunkNum, chunk, completedChunks.incrementAndGet() == chunkedItemLists.size());
                requestSemaphore.release();
                return null;
            }, error -> {
                Log.d(TAG,"Finished chunk " + currentChunkNum + "/" + chunkedItemLists.size());
                Log.e(TAG,"error with chunk "+currentChunkNum+": " + error);
                failFn.apply(error);
                failed.set(true);
                requestSemaphore.release();
                return null;
            });
        }
    }

    protected <T> List<List<T>> createChunks(int chunkSize, List<T> items) {
        return createChunks(items, chunkSize);
    }

    protected <T> List<List<T>> createChunks(List<T> items, int chunkSize) {
        List<List<T>> chunkedItemLists = new ArrayList<>();

        List<T> currentChunk = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            if (i % chunkSize == 0 && i != 0) {
                chunkedItemLists.add(currentChunk);
                currentChunk = new ArrayList<>();
            }

            currentChunk.add(items.get(i));
        }

        if(currentChunk.size() > 0) {
            chunkedItemLists.add(currentChunk);
        }

        return chunkedItemLists;
    }
}
