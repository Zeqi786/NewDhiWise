package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirteen.ui

import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedThirteenBinding
import com.syedzulqarnainsapplication.app.modules.capturevaccinationcardtwo.ui.CaptureVaccinationCardTwoActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordone.ui.EditVaccinationRecordOneActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirteen.`data`.viewmodel.EditVaccinationRecordStep2SelectedThirteenVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyeight.ui.EditVaccinationRecordStep2SelectedTwentyeightActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyfour.ui.EditVaccinationRecordStep2SelectedTwentyfourActivity
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedThirteenActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedThirteenBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_thirteen)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedThirteenVM by
      viewModels<EditVaccinationRecordStep2SelectedThirteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editVaccinationRecordStep2SelectedThirteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.etTextTwo.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedTwentyeightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSubmit.setOnClickListener {
      val destIntent = CaptureVaccinationCardTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.spinnerField.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedTwentyfourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = EditVaccinationRecordOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_THIRTEEN_ACTIVITY"

  }
}
