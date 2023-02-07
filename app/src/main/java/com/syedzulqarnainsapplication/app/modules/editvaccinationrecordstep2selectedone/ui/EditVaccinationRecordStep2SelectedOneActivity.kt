package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.appcomponents.views.DatePickerFragment
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedOneBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecord.ui.EditVaccinationRecordActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeight.ui.EditVaccinationRecordStep2SelectedEightActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectednine.ui.EditVaccinationRecordStep2SelectedNineActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedone.`data`.viewmodel.EditVaccinationRecordStep2SelectedOneVM
import java.util.Date
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedOneActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedOneBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_one)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedOneVM by
      viewModels<EditVaccinationRecordStep2SelectedOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editVaccinationRecordStep2SelectedOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearField.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
          selectedDate ->
        onDateSelectedLinearField(selectedDate)
      }
    }
    binding.spinnerFieldOne.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedNineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = EditVaccinationRecordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.spinnerField.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  private fun onDateSelectedLinearField(selectedDate: Date) {
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditVaccinationRecordStep2SelectedOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
