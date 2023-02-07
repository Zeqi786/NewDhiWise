package com.syedzulqarnainsapplication.app.modules.capturedimagethree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityCapturedImageThreeBinding
import com.syedzulqarnainsapplication.app.modules.capturedimagethree.`data`.viewmodel.CapturedImageThreeVM
import kotlin.String
import kotlin.Unit

class CapturedImageThreeActivity :
    BaseActivity<ActivityCapturedImageThreeBinding>(R.layout.activity_captured_image_three) {
  private val viewModel: CapturedImageThreeVM by viewModels<CapturedImageThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.capturedImageThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CAPTURED_IMAGE_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CapturedImageThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
