package com.syedzulqarnainsapplication.app.modules.scanqrcodeone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityScanQrCodeOneBinding
import com.syedzulqarnainsapplication.app.modules.scanqrcodeone.`data`.viewmodel.ScanQrCodeOneVM
import com.syedzulqarnainsapplication.app.modules.scanqrcodetwo.ui.ScanQrCodeTwoActivity
import kotlin.String
import kotlin.Unit

class ScanQrCodeOneActivity :
    BaseActivity<ActivityScanQrCodeOneBinding>(R.layout.activity_scan_qr_code_one) {
  private val viewModel: ScanQrCodeOneVM by viewModels<ScanQrCodeOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQrCodeOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtTextleftOne.setOnClickListener {
      val destIntent = ScanQrCodeTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SCAN_QR_CODE_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanQrCodeOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
