package com.syedzulqarnainsapplication.app.modules.capturedimageone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityCapturedImageOneBinding
import com.syedzulqarnainsapplication.app.modules.capturedimageone.`data`.viewmodel.CapturedImageOneVM
import kotlin.String
import kotlin.Unit

class CapturedImageOneActivity :
    BaseActivity<ActivityCapturedImageOneBinding>(R.layout.activity_captured_image_one) {
  private val viewModel: CapturedImageOneVM by viewModels<CapturedImageOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.capturedImageOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CAPTURED_IMAGE_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CapturedImageOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
