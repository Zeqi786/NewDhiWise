package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedten.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedTenBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeight.ui.EditVaccinationRecordStep2SelectedEightActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectednine.ui.EditVaccinationRecordStep2SelectedNineActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedsix.ui.EditVaccinationRecordStep2SelectedSixActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedten.`data`.viewmodel.EditVaccinationRecordStep2SelectedTenVM
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedTenActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedTenBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_ten)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedTenVM by
      viewModels<EditVaccinationRecordStep2SelectedTenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editVaccinationRecordStep2SelectedTenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.spinnerFieldTwo.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedSixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.spinnerFieldOne.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedNineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.spinnerField.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_TEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditVaccinationRecordStep2SelectedTenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
