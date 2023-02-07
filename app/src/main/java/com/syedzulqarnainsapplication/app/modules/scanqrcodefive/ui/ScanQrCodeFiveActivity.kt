package com.syedzulqarnainsapplication.app.modules.scanqrcodefive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityScanQrCodeFiveBinding
import com.syedzulqarnainsapplication.app.modules.scanqrcodefive.`data`.viewmodel.ScanQrCodeFiveVM
import kotlin.String
import kotlin.Unit

class ScanQrCodeFiveActivity :
    BaseActivity<ActivityScanQrCodeFiveBinding>(R.layout.activity_scan_qr_code_five) {
  private val viewModel: ScanQrCodeFiveVM by viewModels<ScanQrCodeFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQrCodeFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SCAN_QR_CODE_FIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanQrCodeFiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
