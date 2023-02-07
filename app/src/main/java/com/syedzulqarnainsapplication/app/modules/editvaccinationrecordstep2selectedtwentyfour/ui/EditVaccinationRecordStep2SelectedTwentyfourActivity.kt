package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedTwentyfourBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyeight.ui.EditVaccinationRecordStep2SelectedTwentyeightActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyfour.`data`.viewmodel.EditVaccinationRecordStep2SelectedTwentyfourVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyseven.ui.EditVaccinationRecordStep2SelectedTwentysevenActivity
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedTwentyfourActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedTwentyfourBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_twentyfour)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedTwentyfourVM by
      viewModels<EditVaccinationRecordStep2SelectedTwentyfourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editVaccinationRecordStep2SelectedTwentyfourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.spinnerField.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedTwentysevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etTextTwo.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedTwentyeightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_TWENTYFOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context,
                      EditVaccinationRecordStep2SelectedTwentyfourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
