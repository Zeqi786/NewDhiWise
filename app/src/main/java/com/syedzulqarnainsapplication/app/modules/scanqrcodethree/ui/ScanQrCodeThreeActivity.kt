package com.syedzulqarnainsapplication.app.modules.scanqrcodethree.ui

import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityScanQrCodeThreeBinding
import com.syedzulqarnainsapplication.app.modules.scanqrcodethree.`data`.viewmodel.ScanQrCodeThreeVM
import kotlin.String
import kotlin.Unit

class ScanQrCodeThreeActivity :
    BaseActivity<ActivityScanQrCodeThreeBinding>(R.layout.activity_scan_qr_code_three) {
  private val viewModel: ScanQrCodeThreeVM by viewModels<ScanQrCodeThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQrCodeThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SCAN_QR_CODE_THREE_ACTIVITY"

  }
}
