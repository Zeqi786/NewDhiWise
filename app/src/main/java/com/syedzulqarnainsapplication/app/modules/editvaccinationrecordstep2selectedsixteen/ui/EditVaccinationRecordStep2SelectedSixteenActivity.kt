package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedsixteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedSixteenBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfourteen.ui.EditVaccinationRecordStep2SelectedFourteenActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedseventeen.ui.EditVaccinationRecordStep2SelectedSeventeenActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedsixteen.`data`.model.SpinnerFieldOneModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedsixteen.`data`.viewmodel.EditVaccinationRecordStep2SelectedSixteenVM
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedSixteenActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedSixteenBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_sixteen)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedSixteenVM by
      viewModels<EditVaccinationRecordStep2SelectedSixteenVM>()

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
    binding.editVaccinationRecordStep2SelectedSixteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtLanguage.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedSeventeenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.spinnerField.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedFourteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_SIXTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context,
                                                               
                                  EditVaccinationRecordStep2SelectedSixteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
