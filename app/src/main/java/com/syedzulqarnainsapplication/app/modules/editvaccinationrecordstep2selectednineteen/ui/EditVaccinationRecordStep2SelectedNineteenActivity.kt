package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectednineteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditVaccinationRecordStep2SelectedNineteenBinding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeighteen.ui.EditVaccinationRecordStep2SelectedEighteenActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfifteen.ui.EditVaccinationRecordStep2SelectedFifteenActivity
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectednineteen.`data`.viewmodel.EditVaccinationRecordStep2SelectedNineteenVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedsixteen.ui.EditVaccinationRecordStep2SelectedSixteenActivity
import kotlin.String
import kotlin.Unit

class EditVaccinationRecordStep2SelectedNineteenActivity :
    BaseActivity<ActivityEditVaccinationRecordStep2SelectedNineteenBinding>(R.layout.activity_edit_vaccination_record_step_2_selected_nineteen)
    {
  private val viewModel: EditVaccinationRecordStep2SelectedNineteenVM by
      viewModels<EditVaccinationRecordStep2SelectedNineteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editVaccinationRecordStep2SelectedNineteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.spinnerFieldTwo.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedFifteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.spinnerFieldOne.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedEighteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.spinnerField.setOnClickListener {
      val destIntent = EditVaccinationRecordStep2SelectedSixteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_VACCINATION_RECORD_STEP2SELECTED_NINETEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context,
                      EditVaccinationRecordStep2SelectedNineteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
