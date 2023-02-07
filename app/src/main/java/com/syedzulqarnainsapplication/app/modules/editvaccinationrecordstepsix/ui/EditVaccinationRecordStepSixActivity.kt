package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepsix.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStepSixBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepfive.ui.EditVaccinationRecordStepFiveActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepsix.`data`.viewmodel.EditVaccinationRecordStepSixVM
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStepSixActivity :
    BaseActivity<ActivityEditVaccinationRecordStepSixBinding>(R.layout.activity_edit_vaccination_record_step_six)
    {
  private val viewModel: EditVaccinationRecordStepSixVM by
      viewModels<EditVaccinationRecordStepSixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editVaccinationRecordStepSixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = EditVaccinationRecordStepFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP_SIX_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditVaccinationRecordStepSixActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
