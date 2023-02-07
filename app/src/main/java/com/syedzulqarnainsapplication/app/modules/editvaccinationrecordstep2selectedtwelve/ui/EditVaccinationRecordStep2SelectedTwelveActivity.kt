package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwelve.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedTwelveBinding
import com.syedzulqarnainsapplication.app.modules.capturevaccinationcardfour.ui.CaptureVaccinationCardFourActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeighteen.ui.EditVaccinationRecordStep2SelectedEighteenActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedsixteen.ui.EditVaccinationRecordStep2SelectedSixteenActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwelve.`data`.viewmodel.EditVaccinationRecordStep2SelectedTwelveVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentysix.ui.EditVaccinationRecordStep2SelectedTwentysixDialog
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordtwo.ui.EditVaccinationRecordTwoActivity
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedTwelveActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedTwelveBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_twelve)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedTwelveVM by
      viewModels<EditVaccinationRecordStep2SelectedTwelveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editVaccinationRecordStep2SelectedTwelveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.etDate.setOnClickListener {
      val destFragment = EditVaccinationRecordStep2SelectedTwentysixDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager,
      EditVaccinationRecordStep2SelectedTwentysixDialog.TAG)
    }
    binding.spinnerField.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedSixteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSubmit.setOnClickListener {
      val destIntent = CaptureVaccinationCardFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.spinnerFieldOne.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedEighteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = EditVaccinationRecordTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_TWELVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditVaccinationRecordStep2SelectedTwelveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
