package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyseven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedTwentysevenBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordone.ui.EditVaccinationRecordOneActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyeight.ui.EditVaccinationRecordStep2SelectedTwentyeightActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyfour.ui.EditVaccinationRecordStep2SelectedTwentyfourActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyseven.`data`.viewmodel.EditVaccinationRecordStep2SelectedTwentysevenVM
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedTwentysevenActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedTwentysevenBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_twentyseven)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedTwentysevenVM by
      viewModels<EditVaccinationRecordStep2SelectedTwentysevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editVaccinationRecordStep2SelectedTwentysevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.spinnerField.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedTwentyfourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.etTextTwo.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedTwentyeightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = EditVaccinationRecordOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_TWENTYSEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context,
                      EditVaccinationRecordStep2SelectedTwentysevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
