package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyone.ui

import android.content.Context
import android.view.View
import androidx.fragment.app.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseDialogFragment
import com.syedzulqarnainsapplication.app.databinding.DialogEditVaccinationRecordStep2SelectedThirtyoneBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyfour.ui.EditVaccinationRecordStep2SelectedThirtyfourActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyone.`data`.model.Lists5RowModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyone.`data`.model.SpinnerGroup681Model
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyone.`data`.viewmodel.EditVaccinationRecordStep2SelectedThirtyoneVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentynine.ui.EditVaccinationRecordStep2SelectedTwentynineActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedThirtyoneDialog :
    BaseDialogFragment<DialogEditVaccinationRecordStep2SelectedThirtyoneBinding>(R.layout.dialog_edit_vaccination_record_step_2_selected_thirtyone)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedThirtyoneVM by
      viewModels<EditVaccinationRecordStep2SelectedThirtyoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerGroup681List.value = mutableListOf(
    SpinnerGroup681Model("Item1"),
    SpinnerGroup681Model("Item2"),
    SpinnerGroup681Model("Item3"),
    SpinnerGroup681Model("Item4"),
    SpinnerGroup681Model("Item5")
    )
    val spinnerGroup681Adapter =
    SpinnerGroup681Adapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerGroup681List.value?:
    mutableListOf())
    binding.spinnerGroup681.adapter = spinnerGroup681Adapter
    val listsAdapter = ListsAdapter(viewModel.listsList.value?:mutableListOf())
    binding.recyclerLists.adapter = listsAdapter
    listsAdapter.setOnItemClickListener(
    object : ListsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Lists5RowModel) {
        onClickRecyclerLists(view, position, item)
      }
    }
    )
    viewModel.listsList.observe(requireActivity()) {
      listsAdapter.updateData(it)
    }
    binding.editVaccinationRecordStep2SelectedThirtyoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtOK.setOnClickListener {
      val destIntent =
          EditVaccinationRecordStep2SelectedTwentynineActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
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
    item: Lists5RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_THIRTYONE_DIALOG"

  }
}
