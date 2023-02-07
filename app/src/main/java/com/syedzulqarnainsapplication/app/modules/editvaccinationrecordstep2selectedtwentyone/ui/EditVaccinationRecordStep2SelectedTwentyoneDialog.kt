package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyone.ui

import android.content.Context
import android.view.View
import androidx.fragment.app.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseDialogFragment
import com.syedzulqarnainsapplication.app.databinding.DialogEditVaccinationRecordStep2SelectedTwentyoneBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwelve.ui.EditVaccinationRecordStep2SelectedTwelveActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyfive.ui.EditVaccinationRecordStep2SelectedTwentyfiveActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyone.`data`.model.Lists3RowModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyone.`data`.model.SpinnerGroup655Model
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyone.`data`.viewmodel.EditVaccinationRecordStep2SelectedTwentyoneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedTwentyoneDialog :
    BaseDialogFragment<DialogEditVaccinationRecordStep2SelectedTwentyoneBinding>(R.layout.dialog_edit_vaccination_record_step_2_selected_twentyone)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedTwentyoneVM by
      viewModels<EditVaccinationRecordStep2SelectedTwentyoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerGroup655List.value = mutableListOf(
    SpinnerGroup655Model("Item1"),
    SpinnerGroup655Model("Item2"),
    SpinnerGroup655Model("Item3"),
    SpinnerGroup655Model("Item4"),
    SpinnerGroup655Model("Item5")
    )
    val spinnerGroup655Adapter =
    SpinnerGroup655Adapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerGroup655List.value?:
    mutableListOf())
    binding.spinnerGroup655.adapter = spinnerGroup655Adapter
    val listsAdapter = ListsAdapter(viewModel.listsList.value?:mutableListOf())
    binding.recyclerLists.adapter = listsAdapter
    listsAdapter.setOnItemClickListener(
    object : ListsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Lists3RowModel) {
        onClickRecyclerLists(view, position, item)
      }
    }
    )
    viewModel.listsList.observe(requireActivity()) {
      listsAdapter.updateData(it)
    }
    binding.editVaccinationRecordStep2SelectedTwentyoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtCANCEL.setOnClickListener {
      val destIntent =
          EditVaccinationRecordStep2SelectedTwentyfiveActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
    binding.txtOK.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedTwelveActivity.getIntent(requireActivity(),
          null)
      startActivity(destIntent)
      dismiss()
    }
  }

  fun onClickRecyclerLists(
    view: View,
    position: Int,
    item: Lists3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_TWENTYONE_DIALOG"

  }
}
