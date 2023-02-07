package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentysix.ui

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseDialogFragment
import com.syedzulqarnainsapplication.app.databinding.DialogEditVaccinationRecordStep2SelectedTwentysixBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyfive.ui.EditVaccinationRecordStep2SelectedTwentyfiveActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentysix.`data`.model.Lists2RowModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentysix.`data`.model.SpinnerGroup675Model
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentysix.`data`.viewmodel.EditVaccinationRecordStep2SelectedTwentysixVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedTwentysixDialog :
    BaseDialogFragment<DialogEditVaccinationRecordStep2SelectedTwentysixBinding>(R.layout.dialog_edit_vaccination_record_step_2_selected_twentysix)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedTwentysixVM by
      viewModels<EditVaccinationRecordStep2SelectedTwentysixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerGroup675List.value = mutableListOf(
    SpinnerGroup675Model("Item1"),
    SpinnerGroup675Model("Item2"),
    SpinnerGroup675Model("Item3"),
    SpinnerGroup675Model("Item4"),
    SpinnerGroup675Model("Item5")
    )
    val spinnerGroup675Adapter =
    SpinnerGroup675Adapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerGroup675List.value?:
    mutableListOf())
    binding.spinnerGroup675.adapter = spinnerGroup675Adapter
    val listsAdapter = ListsAdapter(viewModel.listsList.value?:mutableListOf())
    binding.recyclerLists.adapter = listsAdapter
    listsAdapter.setOnItemClickListener(
    object : ListsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Lists2RowModel) {
        onClickRecyclerLists(view, position, item)
      }
    }
    )
    viewModel.listsList.observe(requireActivity()) {
      listsAdapter.updateData(it)
    }
    binding.editVaccinationRecordStep2SelectedTwentysixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtCANCEL.setOnClickListener {
      val destIntent =
      EditVaccinationRecordStep2SelectedTwentyfiveActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
  }

  fun onClickRecyclerLists(
    view: View,
    position: Int,
    item: Lists2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_TWENTYSIX_DIALOG"


    fun getInstance(bundle: Bundle?): EditVaccinationRecordStep2SelectedTwentysixDialog {
      val fragment = EditVaccinationRecordStep2SelectedTwentysixDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
