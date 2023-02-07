package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwenty.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedTwentyBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordone.ui.EditVaccinationRecordOneActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwenty.`data`.model.SpinnerFieldOneModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwenty.`data`.viewmodel.EditVaccinationRecordStep2SelectedTwentyVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyeight.ui.EditVaccinationRecordStep2SelectedTwentyeightActivity
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedTwentyActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedTwentyBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_twenty)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedTwentyVM by
      viewModels<EditVaccinationRecordStep2SelectedTwentyVM>()

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
    binding.editVaccinationRecordStep2SelectedTwentyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.spinnerField.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedTwentyeightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = EditVaccinationRecordOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_TWENTY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditVaccinationRecordStep2SelectedTwentyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
