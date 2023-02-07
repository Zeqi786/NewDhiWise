package com.syedzulqarnainsapplication.app.modules.capturedimagetwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityCapturedImageTwoBinding
import com.syedzulqarnainsapplication.app.modules.capturedimagethree.ui.CapturedImageThreeActivity
import com.syedzulqarnainsapplication.app.modules.capturedimagetwo.`data`.viewmodel.CapturedImageTwoVM
import kotlin.String
import kotlin.Unit

class CapturedImageTwoActivity :
    BaseActivity<ActivityCapturedImageTwoBinding>(R.layout.activity_captured_image_two) {
  private val viewModel: CapturedImageTwoVM by viewModels<CapturedImageTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.capturedImageTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      finish()
    }
    binding.linearRowarrowright.setOnClickListener {
      val destIntent = CapturedImageThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CAPTURED_IMAGE_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CapturedImageTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
