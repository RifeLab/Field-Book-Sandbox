package com.fieldbook.tracker.activities

import android.Manifest
import android.app.AlertDialog
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.text.InputType
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.text.HtmlCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fieldbook.tracker.R
import com.fieldbook.tracker.adapters.FieldDetailAdapter
import com.fieldbook.tracker.adapters.FieldDetailItem
import com.fieldbook.tracker.database.DataHelper
import com.fieldbook.tracker.dialogs.BrapiSyncObsDialog
import com.fieldbook.tracker.interfaces.FieldAdapterController
import com.fieldbook.tracker.interfaces.FieldSortController
import com.fieldbook.tracker.objects.FieldObject
import com.fieldbook.tracker.objects.ImportFormat
import com.fieldbook.tracker.offbeat.traits.formats.Formats
import com.fieldbook.tracker.utilities.ExportUtil
import com.fieldbook.tracker.utilities.SemanticDateUtil
import dagger.hilt.android.AndroidEntryPoint
import pub.devrel.easypermissions.EasyPermissions
import javax.inject.Inject


@AndroidEntryPoint
class FieldDetailFragment : Fragment() {

    @Inject
    lateinit var database: DataHelper

    @Inject
    lateinit var preferences: SharedPreferences

    private var toolbar: Toolbar? = null
    private var fieldId: Int? = null
    private val PERMISSIONS_REQUEST_TRAIT_DATA = 9950

    private lateinit var exportUtil: ExportUtil
    private lateinit var rootView: View
    private lateinit var fieldDisplayNameTextView: TextView
    private lateinit var importDateTextView: TextView
    private lateinit var fieldNarrativeTextView: TextView
    private lateinit var lastEditTextView: TextView
    private lateinit var lastExportTextView: TextView
    private lateinit var traitCountTextView: TextView
    private lateinit var observationCountTextView: TextView
    private lateinit var lastSyncTextView: TextView
    private lateinit var cardViewCollect: CardView
    private lateinit var cardViewExport: CardView
    private lateinit var cardViewSync: CardView
    private lateinit var detailRecyclerView: RecyclerView
    private var adapter: FieldDetailAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        Log.d("onCreateView", "Start")
        rootView = inflater.inflate(R.layout.fragment_field_detail, container, false)
        toolbar = rootView.findViewById(R.id.toolbar)
        exportUtil = ExportUtil(requireActivity(), database)
        fieldDisplayNameTextView = rootView.findViewById(R.id.fieldDisplayName)
        importDateTextView = rootView.findViewById(R.id.importDateTextView)
        fieldNarrativeTextView = rootView.findViewById(R.id.fieldNarrativeTextView)
        lastEditTextView = rootView.findViewById(R.id.lastEditTextView)
        lastExportTextView = rootView.findViewById(R.id.lastExportTextView)
        traitCountTextView = rootView.findViewById(R.id.traitCountTextView)
        observationCountTextView = rootView.findViewById(R.id.observationCountTextView)
        cardViewSync = rootView.findViewById(R.id.cardViewSync)
        lastSyncTextView = rootView.findViewById(R.id.lastSyncTextView)
        detailRecyclerView = rootView.findViewById(R.id.fieldDetailRecyclerView)

        fieldId = arguments?.getInt("fieldId")
        loadFieldDetails()

        val expandCollapseIcon: ImageView = rootView.findViewById(R.id.expand_collapse_icon)
        val collapsibleContent: LinearLayout = rootView.findViewById(R.id.collapsible_content)
        val collapsibleHeader: LinearLayout = rootView.findViewById(R.id.collapsible_header)

        collapsibleHeader.setOnClickListener { v: View? ->
            if (collapsibleContent.visibility == View.GONE) {
                collapsibleContent.visibility = View.VISIBLE
                expandCollapseIcon.setImageResource(R.drawable.ic_chevron_up)
            } else {
                collapsibleContent.visibility = View.GONE
                expandCollapseIcon.setImageResource(R.drawable.ic_chevron_down)
            }
        }

        cardViewCollect = rootView.findViewById(R.id.cardViewCollect)
        cardViewExport = rootView.findViewById(R.id.cardViewExport)

        cardViewCollect.setOnClickListener {
            fieldId?.let { id ->
                if (checkTraitsExist() >= 0) {
                    (activity as? FieldEditorActivity)?.setActiveField(id)
                    collectDataFilePermission()
                }
            } ?: Log.d("FieldDetailFragment", "Field ID is null, cannot collect data")
        }

        cardViewExport.setOnClickListener {
            fieldId?.let { id ->
                if (checkTraitsExist() >= 0) {
                    (activity as? FieldEditorActivity)?.setActiveField(id)
                    exportUtil.exportActiveField()
                }
            } ?: Log.d("FieldDetailFragment", "Field ID is null, cannot export data")
        }

        Log.d("onCreateView", "End")
        return rootView
    }

    override fun onResume() {
        super.onResume()
        loadFieldDetails()
    }

    fun loadFieldDetails() {
        fieldId?.let { id ->
            val field = database.getFieldObject(id)
            updateFieldData(field)
            if (detailRecyclerView.adapter == null) { // initial load
                detailRecyclerView.layoutManager = LinearLayoutManager(context)
                val initialItems = createTraitDetailItems(field).toMutableList()
                adapter = FieldDetailAdapter(initialItems)
                detailRecyclerView.adapter = adapter
                setupToolbar(field)
            } else { // reload after data change
                val newItems = createTraitDetailItems(field)
                adapter?.updateItems(newItems)
            }
        } ?: Log.d("FieldDetailFragment", "Field ID is null")
    }

    private fun updateFieldData(field: FieldObject) {

        cardViewSync.visibility = View.GONE
        cardViewSync.setOnClickListener(null)

        fieldDisplayNameTextView.text = field.exp_alias
        val importDate = field.date_import
        if (!importDate.isNullOrEmpty()) {
            importDateTextView.text = SemanticDateUtil.getSemanticDate(requireContext(), importDate)
        }

        var exp_source: String? = field.exp_source
        if (exp_source.isNullOrEmpty()) { // Sample file import
            exp_source = field.exp_name + ".csv"
        }

        var importFormat: ImportFormat? = field.import_format
        var observationLevel = getString(R.string.field_default_observation_level)

        if (importFormat == ImportFormat.BRAPI) {
            cardViewSync.visibility = View.VISIBLE
            cardViewSync.setOnClickListener {
                val alert = BrapiSyncObsDialog(requireActivity())
                alert.setFieldObject(field)
                alert.show()
            }
            observationLevel = "${field.observation_level}s"
        }
        val sortOrder =
            if (field.exp_sort.isNullOrEmpty()) getString(R.string.field_default_sort_order) else field.exp_sort

        val narrativeString = getString(
            R.string.field_detail_narrative,
            exp_source,
            field.exp_name,
            field.count,
            observationLevel,
            field.attribute_count,
            sortOrder
        )
        fieldNarrativeTextView.text =
            HtmlCompat.fromHtml(narrativeString, HtmlCompat.FROM_HTML_MODE_LEGACY)

        val lastEdit = field.date_edit
        if (!lastEdit.isNullOrEmpty()) {
            lastEditTextView.text = SemanticDateUtil.getSemanticDate(requireContext(), lastEdit)
        } else {
            getString(R.string.no_activity)
        }

        val lastExport = field.date_export
        if (!lastExport.isNullOrEmpty()) {
            lastExportTextView.text = SemanticDateUtil.getSemanticDate(requireContext(), lastExport)
        } else {
            getString(R.string.no_activity)
        }

        val lastSync = ""
        if (!lastSync.isNullOrEmpty()) {
            // TODO: add last sync date to FieldObject and retrieve it
        }

        val traitString = getString(R.string.field_trait_total, field.trait_count)
        val observationString =
            getString(R.string.field_observation_total, field.observation_count)
        traitCountTextView.text =
            HtmlCompat.fromHtml(traitString, HtmlCompat.FROM_HTML_MODE_LEGACY)
        observationCountTextView.text =
            HtmlCompat.fromHtml(observationString, HtmlCompat.FROM_HTML_MODE_LEGACY)
    }

    private fun createTraitDetailItems(field: FieldObject): List<FieldDetailItem> {
        field.getTraitDetails()?.let { traitDetails ->
            return traitDetails.map { traitDetail ->
                val iconRes = Formats.values()
                    .find { it.getDatabaseName(requireActivity()) == traitDetail.getFormat() }?.getIcon()

                FieldDetailItem(
                    traitDetail.getTraitName(),
                    getString(R.string.field_trait_observation_total, traitDetail.getCount()),
                    ContextCompat.getDrawable(requireContext(), iconRes ?: R.drawable.ic_trait_categorical)
                )
            }
        }
        return emptyList()  // Return an empty list if traitDetails is null
    }

    private fun setupToolbar(field: FieldObject) {

        toolbar?.inflateMenu(R.menu.menu_field_details)

        toolbar?.setTitle(R.string.field_detail_title)

        toolbar?.setNavigationIcon(R.drawable.arrow_left)

        toolbar?.setNavigationOnClickListener {

            parentFragmentManager.popBackStack()
        }

        toolbar?.setOnMenuItemClickListener { item ->

            when (item.itemId) {
                android.R.id.home -> {
                    parentFragmentManager.popBackStack()
                }
                R.id.rename -> {
                    showEditDisplayNameDialog(field)
                }
                R.id.sort -> {
                    (activity as? FieldSortController)?.showSortDialog(field)
                }
                R.id.delete -> {
                    (activity as? FieldEditorActivity)?.showDeleteConfirmationDialog(listOf(field.exp_id), true)
                }
            }

            true
        }
    }

    private fun showEditDisplayNameDialog(field: FieldObject) {
        val editText = EditText(context).apply {
            inputType = InputType.TYPE_CLASS_TEXT
            setText(field.exp_alias)
        }

        val builder = AlertDialog.Builder(requireContext(), R.style.AppAlertDialog)
        builder.setTitle(getString(R.string.field_edit_display_name))
        builder.setView(editText)
        builder.setPositiveButton(getString(R.string.dialog_save)) { dialog, _ ->
            val newName = editText.text.toString()
            if (newName.isNotBlank()) {
                database.updateStudyAlias(field.exp_id, newName)
                fieldDisplayNameTextView.text = newName
                field.setExp_alias(newName)
                (activity as? FieldAdapterController)?.queryAndLoadFields()
            }
            dialog.dismiss()
        }
        builder.setNegativeButton(getString(R.string.dialog_cancel)) { dialog, _ ->
            dialog.cancel()
        }

        val dialog = builder.create()
        dialog.show()
    }

    fun checkTraitsExist(): Int {
        val traits = database.getVisibleTrait()

        return when {
            traits.isEmpty() -> {
                Toast.makeText(context, R.string.warning_traits_missing, Toast.LENGTH_SHORT).show()
                -1
            }
            else -> 1
        }
    }

    fun collectDataFilePermission() {
        var perms = arrayOf<String?>(
            Manifest.permission.VIBRATE,
            Manifest.permission.RECORD_AUDIO,
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.CAMERA
        )
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            perms = arrayOf(
                Manifest.permission.VIBRATE,
                Manifest.permission.RECORD_AUDIO,
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.CAMERA
            )
        }
        if (EasyPermissions.hasPermissions(requireActivity(), *perms)) {
            val intent = Intent()
            intent.setClassName(
                requireActivity(),
                "com.fieldbook.tracker.activities.CollectActivity"
            )
            startActivity(intent)
        } else {
            // Do not have permissions, request them now
            EasyPermissions.requestPermissions(
                this, getString(R.string.permission_rationale_trait_features),
                PERMISSIONS_REQUEST_TRAIT_DATA, *perms
            )
        }
    }

}
