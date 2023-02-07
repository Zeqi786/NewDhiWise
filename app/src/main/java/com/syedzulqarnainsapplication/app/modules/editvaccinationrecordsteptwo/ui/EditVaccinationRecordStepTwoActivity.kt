package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordsteptwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStepTwoBinding
import com.syedzulqarnainsapplication.app.modules.capturevaccinationcard.ui.CaptureVaccinationCardActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepone.ui.EditVaccinationRecordStepOneActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordsteptwo.`data`.viewmodel.EditVaccinationRecordStepTwoVM
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStepTwoActivity :
    BaseActivity<ActivityEditVaccinationRecordStepTwoBinding>(R.layout.activity_edit_vaccination_record_step_two)
    {
  private val viewModel: EditVaccinationRecordStepTwoVM by
      viewModels<EditVaccinationRecordStepTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editVaccinationRecordStepTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSubmit.setOnClickListener {
      val destIntent = CaptureVaccinationCardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = EditVaccinationRecordStepOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditVaccinationRecordStepTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
