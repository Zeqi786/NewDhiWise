package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedseventeen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedSeventeenBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeighteen.ui.EditVaccinationRecordStep2SelectedEighteenActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedseventeen.`data`.viewmodel.EditVaccinationRecordStep2SelectedSeventeenVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedsixteen.ui.EditVaccinationRecordStep2SelectedSixteenActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordtwo.ui.EditVaccinationRecordTwoActivity
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedSeventeenActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedSeventeenBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_seventeen)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedSeventeenVM by
      viewModels<EditVaccinationRecordStep2SelectedSeventeenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editVaccinationRecordStep2SelectedSeventeenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.etTextTwo.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedSixteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = EditVaccinationRecordTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.spinnerField.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedEighteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_SEVENTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context,
                EditVaccinationRecordStep2SelectedSeventeenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
