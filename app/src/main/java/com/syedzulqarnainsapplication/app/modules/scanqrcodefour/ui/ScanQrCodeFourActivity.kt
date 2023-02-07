package com.syedzulqarnainsapplication.app.modules.scanqrcodefour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityScanQrCodeFourBinding
import com.syedzulqarnainsapplication.app.modules.scanqrcodefive.ui.ScanQrCodeFiveActivity
import com.syedzulqarnainsapplication.app.modules.scanqrcodefour.`data`.viewmodel.ScanQrCodeFourVM
import kotlin.String
import kotlin.Unit

class ScanQrCodeFourActivity :
    BaseActivity<ActivityScanQrCodeFourBinding>(R.layout.activity_scan_qr_code_four) {
  private val viewModel: ScanQrCodeFourVM by viewModels<ScanQrCodeFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQrCodeFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtTextleftOne.setOnClickListener {
      val destIntent = ScanQrCodeFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SCAN_QR_CODE_FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanQrCodeFourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
