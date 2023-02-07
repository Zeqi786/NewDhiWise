package com.syedzulqarnainsapplication.app.modules.scanqrcodefour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.scanqrcodefour.`data`.model.ScanQrCodeFourModel
import org.koin.core.KoinComponent

class ScanQrCodeFourVM : ViewModel(), KoinComponent {
  val scanQrCodeFourModel: MutableLiveData<ScanQrCodeFourModel> =
      MutableLiveData(ScanQrCodeFourModel())

  var navArguments: Bundle? = null
}
