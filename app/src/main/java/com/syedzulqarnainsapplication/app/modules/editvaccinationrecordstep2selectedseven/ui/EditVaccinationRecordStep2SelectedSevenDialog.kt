package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedseven.ui

import android.content.Context
import android.view.View
import androidx.fragment.app.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseDialogFragment
import com.syedzulqarnainsapplication.app.databinding.DialogEditVaccinationRecordStep2SelectedSevenBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedone.ui.EditVaccinationRecordStep2SelectedOneActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedseven.`data`.model.Lists1RowModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedseven.`data`.model.SpinnerGroup603Model
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedseven.`data`.viewmodel.EditVaccinationRecordStep2SelectedSevenVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwo.ui.EditVaccinationRecordStep2SelectedTwoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedSevenDialog :
    BaseDialogFragment<DialogEditVaccinationRecordStep2SelectedSevenBinding>(R.layout.dialog_edit_vaccination_record_step_2_selected_seven)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedSevenVM by
      viewModels<EditVaccinationRecordStep2SelectedSevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerGroup603List.value = mutableListOf(
    SpinnerGroup603Model("Item1"),
    SpinnerGroup603Model("Item2"),
    SpinnerGroup603Model("Item3"),
    SpinnerGroup603Model("Item4"),
    SpinnerGroup603Model("Item5")
    )
    val spinnerGroup603Adapter =
    SpinnerGroup603Adapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerGroup603List.value?:
    mutableListOf())
    binding.spinnerGroup603.adapter = spinnerGroup603Adapter
    val listsAdapter = ListsAdapter(viewModel.listsList.value?:mutableListOf())
    binding.recyclerLists.adapter = listsAdapter
    listsAdapter.setOnItemClickListener(
    object : ListsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Lists1RowModel) {
        onClickRecyclerLists(view, position, item)
      }
    }
    )
    viewModel.listsList.observe(requireActivity()) {
      listsAdapter.updateData(it)
    }
    binding.editVaccinationRecordStep2SelectedSevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtOK.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedTwoActivity.getIntent(requireActivity(),
          null)
      startActivity(destIntent)
      dismiss()
    }
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
    item: Lists1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_SEVEN_DIALOG"

  }
}
