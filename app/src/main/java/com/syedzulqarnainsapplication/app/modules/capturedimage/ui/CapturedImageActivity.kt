package com.syedzulqarnainsapplication.app.modules.capturedimage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityCapturedImageBinding
import com.syedzulqarnainsapplication.app.modules.capturedimage.`data`.viewmodel.CapturedImageVM
import com.syedzulqarnainsapplication.app.modules.capturedimageone.ui.CapturedImageOneActivity
import kotlin.String
import kotlin.Unit

class CapturedImageActivity :
    BaseActivity<ActivityCapturedImageBinding>(R.layout.activity_captured_image) {
  private val viewModel: CapturedImageVM by viewModels<CapturedImageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.capturedImageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowarrowright.setOnClickListener {
      val destIntent = CapturedImageOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageClose.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CAPTURED_IMAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CapturedImageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
