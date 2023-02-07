package com.syedzulqarnainsapplication.app.modules.capturevaccinationcardone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityCaptureVaccinationCardOneBinding
import com.syedzulqarnainsapplication.app.modules.capturedimage.ui.CapturedImageActivity
import com.syedzulqarnainsapplication.app.modules.capturevaccinationcardone.`data`.viewmodel.CaptureVaccinationCardOneVM
import kotlin.String
import kotlin.Unit

class CaptureVaccinationCardOneActivity :
    BaseActivity<ActivityCaptureVaccinationCardOneBinding>(R.layout.activity_capture_vaccination_card_one)
    {
  private val viewModel: CaptureVaccinationCardOneVM by viewModels<CaptureVaccinationCardOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.captureVaccinationCardOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnellipsetwoOne.setOnClickListener {
      val destIntent = CapturedImageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CAPTURE_VACCINATION_CARD_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CaptureVaccinationCardOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
