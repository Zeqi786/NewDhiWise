package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedTwoBinding
import com.syedzulqarnainsapplication.app.modules.capturevaccinationcard.ui.CaptureVaccinationCardActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecord.ui.EditVaccinationRecordActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeight.ui.EditVaccinationRecordStep2SelectedEightActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfive.ui.EditVaccinationRecordStep2SelectedFiveDialog
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectednine.ui.EditVaccinationRecordStep2SelectedNineActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwo.`data`.viewmodel.EditVaccinationRecordStep2SelectedTwoVM
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedTwoActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedTwoBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_two)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedTwoVM by
      viewModels<EditVaccinationRecordStep2SelectedTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editVaccinationRecordStep2SelectedTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.spinnerField.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etDate.setOnClickListener {
      val destFragment = EditVaccinationRecordStep2SelectedFiveDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager,
      EditVaccinationRecordStep2SelectedFiveDialog.TAG)
    }
    binding.btnSubmit.setOnClickListener {
      val destIntent = CaptureVaccinationCardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.spinnerFieldOne.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedNineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = EditVaccinationRecordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditVaccinationRecordStep2SelectedTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
