package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeighteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedEighteenBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeighteen.`data`.viewmodel.EditVaccinationRecordStep2SelectedEighteenVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedseventeen.ui.EditVaccinationRecordStep2SelectedSeventeenActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedsixteen.ui.EditVaccinationRecordStep2SelectedSixteenActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordtwo.ui.EditVaccinationRecordTwoActivity
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedEighteenActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedEighteenBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_eighteen)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedEighteenVM by
      viewModels<EditVaccinationRecordStep2SelectedEighteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editVaccinationRecordStep2SelectedEighteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.spinnerField.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedSeventeenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etTextTwo.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedSixteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = EditVaccinationRecordTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_EIGHTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context,
                                                   
                      EditVaccinationRecordStep2SelectedEighteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
