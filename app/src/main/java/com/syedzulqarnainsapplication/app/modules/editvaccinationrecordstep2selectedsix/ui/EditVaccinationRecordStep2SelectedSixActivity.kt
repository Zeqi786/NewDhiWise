package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedsix.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedSixBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecord.ui.EditVaccinationRecordActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeight.ui.EditVaccinationRecordStep2SelectedEightActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectednine.ui.EditVaccinationRecordStep2SelectedNineActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedsix.`data`.viewmodel.EditVaccinationRecordStep2SelectedSixVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedten.ui.EditVaccinationRecordStep2SelectedTenActivity
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedSixActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedSixBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_six)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedSixVM by
      viewModels<EditVaccinationRecordStep2SelectedSixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editVaccinationRecordStep2SelectedSixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.spinnerField.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.spinnerFieldTwo.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedTenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = EditVaccinationRecordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.spinnerFieldOne.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedNineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_SIX_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditVaccinationRecordStep2SelectedSixActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
