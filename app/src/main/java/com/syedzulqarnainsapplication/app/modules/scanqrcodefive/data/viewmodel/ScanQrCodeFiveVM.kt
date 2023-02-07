package com.syedzulqarnainsapplication.app.modules.scanqrcodefive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.scanqrcodefive.`data`.model.ScanQrCodeFiveModel
import org.koin.core.KoinComponent

class ScanQrCodeFiveVM : ViewModel(), KoinComponent {
  val scanQrCodeFiveModel: MutableLiveData<ScanQrCodeFiveModel> =
      MutableLiveData(ScanQrCodeFiveModel())

  var navArguments: Bundle? = null
}
