package com.syedzulqarnainsapplication.app.modules.scanqrcodesix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.scanqrcodesix.`data`.model.ScanQrCodeSixModel
import org.koin.core.KoinComponent

class ScanQrCodeSixVM : ViewModel(), KoinComponent {
  val scanQrCodeSixModel: MutableLiveData<ScanQrCodeSixModel> =
      MutableLiveData(ScanQrCodeSixModel())

  var navArguments: Bundle? = null
}
