package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStepFourBinding
import com.syedzulqarnainsapplication.app.modules.capturevaccinationcardfour.ui.CaptureVaccinationCardFourActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepfour.`data`.viewmodel.EditVaccinationRecordStepFourVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepthree.ui.EditVaccinationRecordStepThreeActivity
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStepFourActivity :
    BaseActivity<ActivityEditVaccinationRecordStepFourBinding>(R.layout.activity_edit_vaccination_record_step_four)
    {
  private val viewModel: EditVaccinationRecordStepFourVM by
      viewModels<EditVaccinationRecordStepFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editVaccinationRecordStepFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSubmit.setOnClickListener {
      val destIntent = CaptureVaccinationCardFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = EditVaccinationRecordStepThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP_FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditVaccinationRecordStepFourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
