package com.syedzulqarnainsapplication.app.modules.scanqrcodeeight.ui

import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityScanQrCodeEightBinding
import com.syedzulqarnainsapplication.app.modules.scanqrcodeeight.`data`.viewmodel.ScanQrCodeEightVM
import kotlin.String
import kotlin.Unit

class ScanQrCodeEightActivity :
    BaseActivity<ActivityScanQrCodeEightBinding>(R.layout.activity_scan_qr_code_eight) {
  private val viewModel: ScanQrCodeEightVM by viewModels<ScanQrCodeEightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQrCodeEightVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SCAN_QR_CODE_EIGHT_ACTIVITY"

  }
}
