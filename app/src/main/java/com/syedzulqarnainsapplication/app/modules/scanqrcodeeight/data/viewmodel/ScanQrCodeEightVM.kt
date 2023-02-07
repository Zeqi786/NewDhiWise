package com.syedzulqarnainsapplication.app.modules.scanqrcodeeight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.scanqrcodeeight.`data`.model.ScanQrCodeEightModel
import org.koin.core.KoinComponent

class ScanQrCodeEightVM : ViewModel(), KoinComponent {
  val scanQrCodeEightModel: MutableLiveData<ScanQrCodeEightModel> =
      MutableLiveData(ScanQrCodeEightModel())

  var navArguments: Bundle? = null
}
