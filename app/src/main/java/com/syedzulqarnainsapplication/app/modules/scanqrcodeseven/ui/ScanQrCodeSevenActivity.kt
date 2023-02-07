package com.syedzulqarnainsapplication.app.modules.scanqrcodeseven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityScanQrCodeSevenBinding
import com.syedzulqarnainsapplication.app.modules.scanqrcodeseven.`data`.viewmodel.ScanQrCodeSevenVM
import kotlin.String
import kotlin.Unit

class ScanQrCodeSevenActivity :
    BaseActivity<ActivityScanQrCodeSevenBinding>(R.layout.activity_scan_qr_code_seven) {
  private val viewModel: ScanQrCodeSevenVM by viewModels<ScanQrCodeSevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQrCodeSevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SCAN_QR_CODE_SEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanQrCodeSevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
