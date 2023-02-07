package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyfive.ui

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseDialogFragment
import com.syedzulqarnainsapplication.app.databinding.DialogEditVaccinationRecordStep2SelectedThirtyfiveBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyfive.`data`.model.Lists4RowModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyfive.`data`.model.SpinnerGroup699Model
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyfive.`data`.viewmodel.EditVaccinationRecordStep2SelectedThirtyfiveVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyfour.ui.EditVaccinationRecordStep2SelectedThirtyfourActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedThirtyfiveDialog :
    BaseDialogFragment<DialogEditVaccinationRecordStep2SelectedThirtyfiveBinding>(R.layout.dialog_edit_vaccination_record_step_2_selected_thirtyfive)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedThirtyfiveVM by
      viewModels<EditVaccinationRecordStep2SelectedThirtyfiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerGroup699List.value = mutableListOf(
    SpinnerGroup699Model("Item1"),
    SpinnerGroup699Model("Item2"),
    SpinnerGroup699Model("Item3"),
    SpinnerGroup699Model("Item4"),
    SpinnerGroup699Model("Item5")
    )
    val spinnerGroup699Adapter =
    SpinnerGroup699Adapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerGroup699List.value?:
    mutableListOf())
    binding.spinnerGroup699.adapter = spinnerGroup699Adapter
    val listsAdapter = ListsAdapter(viewModel.listsList.value?:mutableListOf())
    binding.recyclerLists.adapter = listsAdapter
    listsAdapter.setOnItemClickListener(
    object : ListsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Lists4RowModel) {
        onClickRecyclerLists(view, position, item)
      }
    }
    )
    viewModel.listsList.observe(requireActivity()) {
      listsAdapter.updateData(it)
    }
    binding.editVaccinationRecordStep2SelectedThirtyfiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtCANCEL.setOnClickListener {
      val destIntent =
      EditVaccinationRecordStep2SelectedThirtyfourActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
  }

  fun onClickRecyclerLists(
    view: View,
    position: Int,
    item: Lists4RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_THIRTYFIVE_DIALOG"


    fun getInstance(bundle: Bundle?): EditVaccinationRecordStep2SelectedThirtyfiveDialog {
      val fragment = EditVaccinationRecordStep2SelectedThirtyfiveDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
