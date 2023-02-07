package com.syedzulqarnainsapplication.app.modules.scanqrcodetwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityScanQrCodeTwoBinding
import com.syedzulqarnainsapplication.app.modules.scanqrcodetwo.`data`.viewmodel.ScanQrCodeTwoVM
import kotlin.String
import kotlin.Unit

class ScanQrCodeTwoActivity :
    BaseActivity<ActivityScanQrCodeTwoBinding>(R.layout.activity_scan_qr_code_two) {
  private val viewModel: ScanQrCodeTwoVM by viewModels<ScanQrCodeTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQrCodeTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SCAN_QR_CODE_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanQrCodeTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
