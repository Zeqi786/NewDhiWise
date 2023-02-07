package com.syedzulqarnainsapplication.app.modules.capturevaccinationcardfive.ui

import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityCaptureVaccinationCardFiveBinding
import com.syedzulqarnainsapplication.app.modules.capturedimagefive.ui.CapturedImageFiveActivity
import com.syedzulqarnainsapplication.app.modules.capturevaccinationcardfive.`data`.viewmodel.CaptureVaccinationCardFiveVM
import kotlin.String
import kotlin.Unit

class CaptureVaccinationCardFiveActivity :
    BaseActivity<ActivityCaptureVaccinationCardFiveBinding>(R.layout.activity_capture_vaccination_card_five)
    {
  private val viewModel: CaptureVaccinationCardFiveVM by viewModels<CaptureVaccinationCardFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.captureVaccinationCardFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnellipsetwoOne.setOnClickListener {
      val destIntent = CapturedImageFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CAPTURE_VACCINATION_CARD_FIVE_ACTIVITY"

  }
}
