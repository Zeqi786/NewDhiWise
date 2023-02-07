package com.syedzulqarnainsapplication.app.modules.scanqrcodetwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.scanqrcodetwo.`data`.model.ScanQrCodeTwoModel
import org.koin.core.KoinComponent

class ScanQrCodeTwoVM : ViewModel(), KoinComponent {
  val scanQrCodeTwoModel: MutableLiveData<ScanQrCodeTwoModel> =
      MutableLiveData(ScanQrCodeTwoModel())

  var navArguments: Bundle? = null
}
