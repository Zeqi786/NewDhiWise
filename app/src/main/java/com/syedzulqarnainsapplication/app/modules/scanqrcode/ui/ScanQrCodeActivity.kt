package com.syedzulqarnainsapplication.app.modules.scanqrcode.ui

import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityScanQrCodeBinding
import com.syedzulqarnainsapplication.app.modules.scanqrcode.`data`.viewmodel.ScanQrCodeVM
import kotlin.String
import kotlin.Unit

class ScanQrCodeActivity : BaseActivity<ActivityScanQrCodeBinding>(R.layout.activity_scan_qr_code) {
  private val viewModel: ScanQrCodeVM by viewModels<ScanQrCodeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQrCodeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SCAN_QR_CODE_ACTIVITY"

  }
}
