package com.syedzulqarnainsapplication.app.modules.scanqrcode.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.scanqrcode.`data`.model.ScanQrCodeModel
import org.koin.core.KoinComponent

class ScanQrCodeVM : ViewModel(), KoinComponent {
  val scanQrCodeModel: MutableLiveData<ScanQrCodeModel> = MutableLiveData(ScanQrCodeModel())

  var navArguments: Bundle? = null
}
