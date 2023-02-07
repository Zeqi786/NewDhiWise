package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtythree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedThirtythreeBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirty.ui.EditVaccinationRecordStep2SelectedThirtyActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtythree.`data`.model.SpinnerFieldModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtythree.`data`.model.SpinnerFieldOneModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtythree.`data`.viewmodel.EditVaccinationRecordStep2SelectedThirtythreeVM
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedThirtythreeActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedThirtythreeBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_thirtythree)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedThirtythreeVM by
      viewModels<EditVaccinationRecordStep2SelectedThirtythreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerFieldList.value = mutableListOf(
    SpinnerFieldModel("Item1"),
    SpinnerFieldModel("Item2"),
    SpinnerFieldModel("Item3"),
    SpinnerFieldModel("Item4"),
    SpinnerFieldModel("Item5")
    )
    val spinnerFieldAdapter =
    SpinnerFieldAdapter(this,R.layout.spinner_item,viewModel.spinnerFieldList.value?:
    mutableListOf())
    binding.spinnerField.adapter = spinnerFieldAdapter
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
    binding.editVaccinationRecordStep2SelectedThirtythreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.spinnerFieldTwo.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedThirtyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_THIRTYTHREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context,
                      EditVaccinationRecordStep2SelectedThirtythreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
