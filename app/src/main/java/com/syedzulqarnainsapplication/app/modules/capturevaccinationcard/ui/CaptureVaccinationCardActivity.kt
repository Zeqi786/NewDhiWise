package com.syedzulqarnainsapplication.app.modules.capturevaccinationcard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityCaptureVaccinationCardBinding
import com.syedzulqarnainsapplication.app.modules.capturevaccinationcard.`data`.viewmodel.CaptureVaccinationCardVM
import com.syedzulqarnainsapplication.app.modules.capturevaccinationcardone.ui.CaptureVaccinationCardOneActivity
import com.syedzulqarnainsapplication.app.modules.scanqrcodeone.ui.ScanQrCodeOneActivity
import kotlin.String
import kotlin.Unit

class CaptureVaccinationCardActivity :
    BaseActivity<ActivityCaptureVaccinationCardBinding>(R.layout.activity_capture_vaccination_card)
    {
  private val viewModel: CaptureVaccinationCardVM by viewModels<CaptureVaccinationCardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.captureVaccinationCardVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtTextleftOne.setOnClickListener {
      val destIntent = CaptureVaccinationCardOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtTextleft.setOnClickListener {
      val destIntent = ScanQrCodeOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CAPTURE_VACCINATION_CARD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CaptureVaccinationCardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
