package com.syedzulqarnainsapplication.app.modules.scanqrcodeseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.scanqrcodeseven.`data`.model.ScanQrCodeSevenModel
import org.koin.core.KoinComponent

class ScanQrCodeSevenVM : ViewModel(), KoinComponent {
  val scanQrCodeSevenModel: MutableLiveData<ScanQrCodeSevenModel> =
      MutableLiveData(ScanQrCodeSevenModel())

  var navArguments: Bundle? = null
}
