package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.appcomponents.views.DatePickerFragment
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedThirtyfourBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyfour.`data`.model.SpinnerFieldModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyfour.`data`.model.SpinnerFieldOneModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyfour.`data`.viewmodel.EditVaccinationRecordStep2SelectedThirtyfourVM
import java.util.Date
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedThirtyfourActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedThirtyfourBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_thirtyfour)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedThirtyfourVM by
      viewModels<EditVaccinationRecordStep2SelectedThirtyfourVM>()

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
    binding.editVaccinationRecordStep2SelectedThirtyfourVM = viewModel
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
  }

  private fun onDateSelectedLinearField(selectedDate: Date) {
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_THIRTYFOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context,
                      EditVaccinationRecordStep2SelectedThirtyfourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
