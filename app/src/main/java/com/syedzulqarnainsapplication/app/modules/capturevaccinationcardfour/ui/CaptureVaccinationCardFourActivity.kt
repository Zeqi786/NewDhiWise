package com.syedzulqarnainsapplication.app.modules.capturevaccinationcardfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityCaptureVaccinationCardFourBinding
import com.syedzulqarnainsapplication.app.modules.capturevaccinationcardfour.`data`.viewmodel.CaptureVaccinationCardFourVM
import com.syedzulqarnainsapplication.app.modules.capturevaccinationcardthree.ui.CaptureVaccinationCardThreeActivity
import com.syedzulqarnainsapplication.app.modules.scanqrcodefour.ui.ScanQrCodeFourActivity
import kotlin.String
import kotlin.Unit

class CaptureVaccinationCardFourActivity :
    BaseActivity<ActivityCaptureVaccinationCardFourBinding>(R.layout.activity_capture_vaccination_card_four)
    {
  private val viewModel: CaptureVaccinationCardFourVM by viewModels<CaptureVaccinationCardFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.captureVaccinationCardFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtTextleftOne.setOnClickListener {
      val destIntent = CaptureVaccinationCardThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtTextleft.setOnClickListener {
      val destIntent = ScanQrCodeFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CAPTURE_VACCINATION_CARD_FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CaptureVaccinationCardFourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
