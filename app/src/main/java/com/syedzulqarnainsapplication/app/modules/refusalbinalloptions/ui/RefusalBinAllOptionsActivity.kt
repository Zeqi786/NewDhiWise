package com.syedzulqarnainsapplication.app.modules.refusalbinalloptions.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityRefusalBinAllOptionsBinding
import com.syedzulqarnainsapplication.app.modules.refusalbin.ui.RefusalBinActivity
import com.syedzulqarnainsapplication.app.modules.refusalbinalloptions.`data`.viewmodel.RefusalBinAllOptionsVM
import kotlin.String
import kotlin.Unit

class RefusalBinAllOptionsActivity :
    BaseActivity<ActivityRefusalBinAllOptionsBinding>(R.layout.activity_refusal_bin_all_options) {
  private val viewModel: RefusalBinAllOptionsVM by viewModels<RefusalBinAllOptionsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.refusalBinAllOptionsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.spinnerDropdown.setOnClickListener {
      val destIntent = RefusalBinActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageClose.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "REFUSAL_BIN_ALL_OPTIONS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RefusalBinAllOptionsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
