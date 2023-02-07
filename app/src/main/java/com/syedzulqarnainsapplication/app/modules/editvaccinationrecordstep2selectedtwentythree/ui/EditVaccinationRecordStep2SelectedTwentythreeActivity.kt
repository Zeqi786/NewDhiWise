package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentythree.ui

import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedTwentythreeBinding
import com.syedzulqarnainsapplication.app.modules.capturevaccinationcardfour.ui.CaptureVaccinationCardFourActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeighteen.ui.EditVaccinationRecordStep2SelectedEighteenActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedsixteen.ui.EditVaccinationRecordStep2SelectedSixteenActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentythree.`data`.viewmodel.EditVaccinationRecordStep2SelectedTwentythreeVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordtwo.ui.EditVaccinationRecordTwoActivity
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedTwentythreeActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedTwentythreeBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_twentythree)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedTwentythreeVM by
      viewModels<EditVaccinationRecordStep2SelectedTwentythreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editVaccinationRecordStep2SelectedTwentythreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.spinnerField.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedEighteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = EditVaccinationRecordTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etTextTwo.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedSixteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSubmit.setOnClickListener {
      val destIntent = CaptureVaccinationCardFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_TWENTYTHREE_ACTIVITY"

  }
}
