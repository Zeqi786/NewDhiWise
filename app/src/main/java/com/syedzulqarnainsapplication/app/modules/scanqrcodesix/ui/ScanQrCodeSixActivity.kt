package com.syedzulqarnainsapplication.app.modules.scanqrcodesix.ui

import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityScanQrCodeSixBinding
import com.syedzulqarnainsapplication.app.modules.scanqrcodeseven.ui.ScanQrCodeSevenActivity
import com.syedzulqarnainsapplication.app.modules.scanqrcodesix.`data`.viewmodel.ScanQrCodeSixVM
import kotlin.String
import kotlin.Unit

class ScanQrCodeSixActivity :
    BaseActivity<ActivityScanQrCodeSixBinding>(R.layout.activity_scan_qr_code_six) {
  private val viewModel: ScanQrCodeSixVM by viewModels<ScanQrCodeSixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQrCodeSixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtTextleftOne.setOnClickListener {
      val destIntent = ScanQrCodeSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SCAN_QR_CODE_SIX_ACTIVITY"

  }
}
