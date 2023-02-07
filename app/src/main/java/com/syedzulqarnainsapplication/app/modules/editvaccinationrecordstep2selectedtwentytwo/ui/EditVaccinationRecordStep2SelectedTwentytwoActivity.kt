package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentytwo.ui

import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedTwentytwoBinding
import com.syedzulqarnainsapplication.app.modules.capturevaccinationcardfour.ui.CaptureVaccinationCardFourActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeighteen.ui.EditVaccinationRecordStep2SelectedEighteenActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectednineteen.ui.EditVaccinationRecordStep2SelectedNineteenActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedsixteen.ui.EditVaccinationRecordStep2SelectedSixteenActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentytwo.`data`.viewmodel.EditVaccinationRecordStep2SelectedTwentytwoVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordtwo.ui.EditVaccinationRecordTwoActivity
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedTwentytwoActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedTwentytwoBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_twentytwo)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedTwentytwoVM by
      viewModels<EditVaccinationRecordStep2SelectedTwentytwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editVaccinationRecordStep2SelectedTwentytwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.spinnerField.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedSixteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etTextTwo.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedNineteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.spinnerFieldOne.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedEighteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = EditVaccinationRecordTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSubmit.setOnClickListener {
      val destIntent = CaptureVaccinationCardFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_TWENTYTWO_ACTIVITY"

  }
}
