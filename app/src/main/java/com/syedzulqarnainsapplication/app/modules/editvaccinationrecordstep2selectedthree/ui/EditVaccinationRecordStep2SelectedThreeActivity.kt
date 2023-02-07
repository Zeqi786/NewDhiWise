package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedThreeBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecord.ui.EditVaccinationRecordActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeight.ui.EditVaccinationRecordStep2SelectedEightActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectednine.ui.EditVaccinationRecordStep2SelectedNineActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthree.`data`.viewmodel.EditVaccinationRecordStep2SelectedThreeVM
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedThreeActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedThreeBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_three)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedThreeVM by
      viewModels<EditVaccinationRecordStep2SelectedThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editVaccinationRecordStep2SelectedThreeVM = viewModel
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
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = EditVaccinationRecordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditVaccinationRecordStep2SelectedThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
