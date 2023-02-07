package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeight.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedEightBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeight.`data`.model.SpinnerFieldOneModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeight.`data`.viewmodel.EditVaccinationRecordStep2SelectedEightVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfour.ui.EditVaccinationRecordStep2SelectedFourActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthree.ui.EditVaccinationRecordStep2SelectedThreeActivity
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedEightActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedEightBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_eight)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedEightVM by
      viewModels<EditVaccinationRecordStep2SelectedEightVM>()

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
    binding.editVaccinationRecordStep2SelectedEightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtLanguage.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.spinnerField.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_EIGHT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditVaccinationRecordStep2SelectedEightActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
