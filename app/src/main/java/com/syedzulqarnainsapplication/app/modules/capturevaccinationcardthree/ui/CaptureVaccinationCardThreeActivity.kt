package com.syedzulqarnainsapplication.app.modules.capturevaccinationcardthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityCaptureVaccinationCardThreeBinding
import com.syedzulqarnainsapplication.app.modules.capturedimagetwo.ui.CapturedImageTwoActivity
import com.syedzulqarnainsapplication.app.modules.capturevaccinationcardthree.`data`.viewmodel.CaptureVaccinationCardThreeVM
import kotlin.String
import kotlin.Unit

class CaptureVaccinationCardThreeActivity :
    BaseActivity<ActivityCaptureVaccinationCardThreeBinding>(R.layout.activity_capture_vaccination_card_three)
    {
  private val viewModel: CaptureVaccinationCardThreeVM by
      viewModels<CaptureVaccinationCardThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.captureVaccinationCardThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnellipsetwoOne.setOnClickListener {
      val destIntent = CapturedImageTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CAPTURE_VACCINATION_CARD_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CaptureVaccinationCardThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
