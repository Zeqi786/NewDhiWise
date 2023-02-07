package com.syedzulqarnainsapplication.app.modules.editvaccinationrecord.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.appcomponents.views.DatePickerFragment
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecord.`data`.model.SpinnerFieldModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecord.`data`.model.SpinnerFieldOneModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecord.`data`.viewmodel.EditVaccinationRecordVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfour.ui.EditVaccinationRecordStep2SelectedFourActivity
import java.util.Date
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordActivity :
    BaseActivity<ActivityEditVaccinationRecordBinding>(R.layout.activity_edit_vaccination_record) {
  private val viewModel: EditVaccinationRecordVM by viewModels<EditVaccinationRecordVM>()

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
    binding.editVaccinationRecordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearField.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
        selectedDate ->
        onDateSelectedLinearField(selectedDate)
      }
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearField1.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
        selectedDate ->
        onDateSelectedLinearField1(selectedDate)
      }
    }
    binding.btnNext.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  private fun onDateSelectedLinearField(selectedDate: Date): Unit {
  }

  private fun onDateSelectedLinearField1(selectedDate: Date): Unit {
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditVaccinationRecordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
