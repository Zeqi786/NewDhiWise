package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentynine.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedTwentynineBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyfive.ui.EditVaccinationRecordStep2SelectedThirtyfiveDialog
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentynine.`data`.model.SpinnerFieldModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentynine.`data`.model.SpinnerFieldOneModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentynine.`data`.viewmodel.EditVaccinationRecordStep2SelectedTwentynineVM
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedTwentynineActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedTwentynineBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_twentynine)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedTwentynineVM by
      viewModels<EditVaccinationRecordStep2SelectedTwentynineVM>()

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
    binding.editVaccinationRecordStep2SelectedTwentynineVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.etDate.setOnClickListener {
      val destFragment = EditVaccinationRecordStep2SelectedThirtyfiveDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager,
          EditVaccinationRecordStep2SelectedThirtyfiveDialog.TAG)
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_TWENTYNINE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context,
                EditVaccinationRecordStep2SelectedTwentynineActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
