package com.syedzulqarnainsapplication.app.modules.capturedimagefive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityCapturedImageFiveBinding
import com.syedzulqarnainsapplication.app.modules.capturedimagefive.`data`.viewmodel.CapturedImageFiveVM
import com.syedzulqarnainsapplication.app.modules.capturedimagefour.ui.CapturedImageFourActivity
import kotlin.String
import kotlin.Unit

class CapturedImageFiveActivity :
    BaseActivity<ActivityCapturedImageFiveBinding>(R.layout.activity_captured_image_five) {
  private val viewModel: CapturedImageFiveVM by viewModels<CapturedImageFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.capturedImageFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      finish()
    }
    binding.linearRowarrowright.setOnClickListener {
      val destIntent = CapturedImageFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CAPTURED_IMAGE_FIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CapturedImageFiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
