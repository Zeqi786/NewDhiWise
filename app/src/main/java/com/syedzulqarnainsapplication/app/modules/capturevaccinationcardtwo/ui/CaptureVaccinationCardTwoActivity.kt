package com.syedzulqarnainsapplication.app.modules.capturevaccinationcardtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityCaptureVaccinationCardTwoBinding
import com.syedzulqarnainsapplication.app.modules.capturevaccinationcardtwo.`data`.viewmodel.CaptureVaccinationCardTwoVM
import kotlin.String
import kotlin.Unit

class CaptureVaccinationCardTwoActivity :
    BaseActivity<ActivityCaptureVaccinationCardTwoBinding>(R.layout.activity_capture_vaccination_card_two)
    {
  private val viewModel: CaptureVaccinationCardTwoVM by viewModels<CaptureVaccinationCardTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.captureVaccinationCardTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CAPTURE_VACCINATION_CARD_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CaptureVaccinationCardTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
