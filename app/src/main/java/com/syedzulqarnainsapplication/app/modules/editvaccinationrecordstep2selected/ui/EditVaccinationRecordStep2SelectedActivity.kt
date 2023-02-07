package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selected.ui

import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedBinding
import com.syedzulqarnainsapplication.app.modules.capturevaccinationcard.ui.CaptureVaccinationCardActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecord.ui.EditVaccinationRecordActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selected.`data`.viewmodel.EditVaccinationRecordStep2SelectedVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeight.ui.EditVaccinationRecordStep2SelectedEightActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectednine.ui.EditVaccinationRecordStep2SelectedNineActivity
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedBinding>(R.layout.activity_edit_vaccination_record_step_2_selected)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedVM by
      viewModels<EditVaccinationRecordStep2SelectedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editVaccinationRecordStep2SelectedVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.spinnerField.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedNineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etTextTwo.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSubmit.setOnClickListener {
      val destIntent = CaptureVaccinationCardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = EditVaccinationRecordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_ACTIVITY"

  }
}
