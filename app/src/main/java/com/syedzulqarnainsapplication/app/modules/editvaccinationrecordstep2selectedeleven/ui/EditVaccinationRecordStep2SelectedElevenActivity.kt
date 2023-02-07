package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeleven.ui

import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedElevenBinding
import com.syedzulqarnainsapplication.app.modules.capturevaccinationcard.ui.CaptureVaccinationCardActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecord.ui.EditVaccinationRecordActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeight.ui.EditVaccinationRecordStep2SelectedEightActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeleven.`data`.viewmodel.EditVaccinationRecordStep2SelectedElevenVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectednine.ui.EditVaccinationRecordStep2SelectedNineActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedten.ui.EditVaccinationRecordStep2SelectedTenActivity
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedElevenActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedElevenBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_eleven)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedElevenVM by
      viewModels<EditVaccinationRecordStep2SelectedElevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editVaccinationRecordStep2SelectedElevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSubmit.setOnClickListener {
      val destIntent = CaptureVaccinationCardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.spinnerField.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = EditVaccinationRecordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.etTextTwo.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedTenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.spinnerFieldOne.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedNineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_ELEVEN_ACTIVITY"

  }
}
