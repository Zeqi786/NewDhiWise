package com.syedzulqarnainsapplication.app.modules.capturedimagefour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityCapturedImageFourBinding
import com.syedzulqarnainsapplication.app.modules.capturedimagefour.`data`.viewmodel.CapturedImageFourVM
import kotlin.String
import kotlin.Unit

class CapturedImageFourActivity :
    BaseActivity<ActivityCapturedImageFourBinding>(R.layout.activity_captured_image_four) {
  private val viewModel: CapturedImageFourVM by viewModels<CapturedImageFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.capturedImageFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CAPTURED_IMAGE_FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CapturedImageFourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
