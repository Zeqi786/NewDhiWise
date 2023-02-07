package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfourteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedFourteenBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfourteen.`data`.model.SpinnerFieldOneModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfourteen.`data`.viewmodel.EditVaccinationRecordStep2SelectedFourteenVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedsixteen.ui.EditVaccinationRecordStep2SelectedSixteenActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordtwo.ui.EditVaccinationRecordTwoActivity
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedFourteenActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedFourteenBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_fourteen)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedFourteenVM by
      viewModels<EditVaccinationRecordStep2SelectedFourteenVM>()

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
    binding.editVaccinationRecordStep2SelectedFourteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.spinnerField.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedSixteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = EditVaccinationRecordTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_FOURTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context,
                      EditVaccinationRecordStep2SelectedFourteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
