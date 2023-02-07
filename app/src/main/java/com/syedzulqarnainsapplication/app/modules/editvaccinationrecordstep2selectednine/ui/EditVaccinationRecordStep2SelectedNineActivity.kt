package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectednine.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedNineBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecord.ui.EditVaccinationRecordActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeight.ui.EditVaccinationRecordStep2SelectedEightActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectednine.`data`.viewmodel.EditVaccinationRecordStep2SelectedNineVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthree.ui.EditVaccinationRecordStep2SelectedThreeActivity
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedNineActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedNineBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_nine)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedNineVM by
      viewModels<EditVaccinationRecordStep2SelectedNineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editVaccinationRecordStep2SelectedNineVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.spinnerField.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etTextTwo.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = EditVaccinationRecordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_NINE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditVaccinationRecordStep2SelectedNineActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
