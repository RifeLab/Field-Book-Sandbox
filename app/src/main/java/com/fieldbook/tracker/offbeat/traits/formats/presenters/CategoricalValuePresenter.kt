package com.fieldbook.tracker.offbeat.traits.formats.presenters

import android.content.Context
import androidx.preference.PreferenceManager
import com.fieldbook.tracker.preferences.GeneralKeys
import com.fieldbook.tracker.utilities.CategoryJsonUtil
import org.brapi.v2.model.pheno.BrAPIScaleValidValuesCategories

class CategoricalValuePresenter : ValuePresenter {
    override fun represent(context: Context, value: Any): String {

        val labelValPref: String = PreferenceManager.getDefaultSharedPreferences(context)
            .getString(GeneralKeys.LABELVAL_CUSTOMIZE, "value") ?: "value"

        return CategoryJsonUtil.flattenMultiCategoryValue(
            value as ArrayList<BrAPIScaleValidValuesCategories>,
            labelValPref == "label"
        )
    }
}
