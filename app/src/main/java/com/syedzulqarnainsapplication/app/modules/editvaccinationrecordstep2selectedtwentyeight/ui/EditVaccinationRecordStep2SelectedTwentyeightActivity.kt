package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyeight.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedTwentyeightBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwenty.ui.EditVaccinationRecordStep2SelectedTwentyActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyeight.`data`.model.SpinnerFieldOneModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyeight.`data`.viewmodel.EditVaccinationRecordStep2SelectedTwentyeightVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyseven.ui.EditVaccinationRecordStep2SelectedTwentysevenActivity
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedTwentyeightActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedTwentyeightBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_twentyeight)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedTwentyeightVM by
      viewModels<EditVaccinationRecordStep2SelectedTwentyeightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerFieldOneList.value = mutableListOf(
    SpinnerFieldOneModel("Item1"),
    SpinnerFieldOneModel("Item2"),
    SpinnerFieldOneModel("Item3"),
    SpinnerFieldOneModel("Item4"),
    SpinnerFieldOneModel("Item5")
    )
    val spinnerFieldOneAdapter =
    SpinnerFieldOneAdapter(this,R.layout.spinner_item,viewModel.spinnerFieldOneList.value?:
    mutableListOf())
    binding.spinnerFieldOne.adapter = spinnerFieldOneAdapter
    binding.editVaccinationRecordStep2SelectedTwentyeightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.spinnerField.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedTwentyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txtLanguage.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedTwentysevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_TWENTYEIGHT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context,
                                  EditVaccinationRecordStep2SelectedTwentyeightActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
