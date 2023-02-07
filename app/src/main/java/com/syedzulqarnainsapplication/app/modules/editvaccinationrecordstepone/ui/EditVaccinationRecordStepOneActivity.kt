package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.appcomponents.views.DatePickerFragment
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStepOneBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepone.`data`.model.SpinnerFieldModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepone.`data`.model.SpinnerFieldOneModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepone.`data`.viewmodel.EditVaccinationRecordStepOneVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordsteptwo.ui.EditVaccinationRecordStepTwoActivity
import java.util.Date
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStepOneActivity :
    BaseActivity<ActivityEditVaccinationRecordStepOneBinding>(R.layout.activity_edit_vaccination_record_step_one)
    {
  private val viewModel: EditVaccinationRecordStepOneVM by
      viewModels<EditVaccinationRecordStepOneVM>()

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
    binding.editVaccinationRecordStepOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearField.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
        selectedDate ->
        onDateSelectedLinearField(selectedDate)
      }
    }
    binding.btnNext.setOnClickListener {
      val destIntent = EditVaccinationRecordStepTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearField1.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
        selectedDate ->
        onDateSelectedLinearField1(selectedDate)
      }
    }
  }

  private fun onDateSelectedLinearField(selectedDate: Date): Unit {
  }

  private fun onDateSelectedLinearField1(selectedDate: Date): Unit {
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditVaccinationRecordStepOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
