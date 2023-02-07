package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtytwo.ui

import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedThirtytwoBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtythree.ui.EditVaccinationRecordStep2SelectedThirtythreeActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtytwo.`data`.model.SpinnerFieldModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtytwo.`data`.model.SpinnerFieldOneModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtytwo.`data`.viewmodel.EditVaccinationRecordStep2SelectedThirtytwoVM
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedThirtytwoActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedThirtytwoBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_thirtytwo)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedThirtytwoVM by
      viewModels<EditVaccinationRecordStep2SelectedThirtytwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerFieldList.value = mutableListOf(
    SpinnerFieldModel("Item1"),
    SpinnerFieldModel("Item2"),
    SpinnerFieldModel("Item3"),
    SpinnerFieldModel("Item4"),
    SpinnerFieldModel("Item5")
    )
    val spinnerFieldAdapter =
    SpinnerFieldAdapter(this,R.layout.spinner_item,viewModel.spinnerFieldList.value?:
    mutableListOf())
    binding.spinnerField.adapter = spinnerFieldAdapter
    viewModel.spinnerFieldOneList.value = mutableListOf(
    SpinnerFieldOneModel("Item1"),
    SpinnerFieldOneModel("Item2"),
    SpinnerFieldOneModel("Item3"),
    SpinnerFieldOneModel("Item4"),
    SpinnerFieldOneModel("Item5")
    )
    val spinnerFieldOneAdapter =
    SpinnerFieldOneAdapter(this,R.layout.spinner_item,viewModel.spinnerFieldOneList.value?:
    mutableListOf())
    binding.spinnerFieldOne.adapter = spinnerFieldOneAdapter
    binding.editVaccinationRecordStep2SelectedThirtytwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.etTextTwo.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedThirtythreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_THIRTYTWO_ACTIVITY"

  }
}
