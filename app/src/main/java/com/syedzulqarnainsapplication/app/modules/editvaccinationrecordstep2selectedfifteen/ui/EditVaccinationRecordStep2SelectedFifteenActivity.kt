package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfifteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedFifteenBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeighteen.ui.EditVaccinationRecordStep2SelectedEighteenActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfifteen.`data`.viewmodel.EditVaccinationRecordStep2SelectedFifteenVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectednineteen.ui.EditVaccinationRecordStep2SelectedNineteenActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedsixteen.ui.EditVaccinationRecordStep2SelectedSixteenActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordtwo.ui.EditVaccinationRecordTwoActivity
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedFifteenActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedFifteenBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_fifteen)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedFifteenVM by
      viewModels<EditVaccinationRecordStep2SelectedFifteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editVaccinationRecordStep2SelectedFifteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.spinnerFieldOne.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedEighteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.spinnerField.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedSixteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.spinnerFieldTwo.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedNineteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = EditVaccinationRecordTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_FIFTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context,
          EditVaccinationRecordStep2SelectedFifteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
