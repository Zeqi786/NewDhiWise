package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfive.ui

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseDialogFragment
import com.syedzulqarnainsapplication.app.databinding.DialogEditVaccinationRecordStep2SelectedFiveBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfive.`data`.model.ListsRowModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfive.`data`.model.SpinnerGroup599Model
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfive.`data`.viewmodel.EditVaccinationRecordStep2SelectedFiveVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedone.ui.EditVaccinationRecordStep2SelectedOneActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedFiveDialog :
    BaseDialogFragment<DialogEditVaccinationRecordStep2SelectedFiveBinding>(R.layout.dialog_edit_vaccination_record_step_2_selected_five)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedFiveVM by
      viewModels<EditVaccinationRecordStep2SelectedFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerGroup599List.value = mutableListOf(
    SpinnerGroup599Model("Item1"),
    SpinnerGroup599Model("Item2"),
    SpinnerGroup599Model("Item3"),
    SpinnerGroup599Model("Item4"),
    SpinnerGroup599Model("Item5")
    )
    val spinnerGroup599Adapter =
    SpinnerGroup599Adapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerGroup599List.value?:
    mutableListOf())
    binding.spinnerGroup599.adapter = spinnerGroup599Adapter
    val listsAdapter = ListsAdapter(viewModel.listsList.value?:mutableListOf())
    binding.recyclerLists.adapter = listsAdapter
    listsAdapter.setOnItemClickListener(
    object : ListsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListsRowModel) {
        onClickRecyclerLists(view, position, item)
      }
    }
    )
    viewModel.listsList.observe(requireActivity()) {
      listsAdapter.updateData(it)
    }
    binding.editVaccinationRecordStep2SelectedFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtCANCEL.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedOneActivity.getIntent(requireActivity(),
      null)
      startActivity(destIntent)
      dismiss()
    }
  }

  fun onClickRecyclerLists(
    view: View,
    position: Int,
    item: ListsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_FIVE_DIALOG"


    fun getInstance(bundle: Bundle?): EditVaccinationRecordStep2SelectedFiveDialog {
      val fragment = EditVaccinationRecordStep2SelectedFiveDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
