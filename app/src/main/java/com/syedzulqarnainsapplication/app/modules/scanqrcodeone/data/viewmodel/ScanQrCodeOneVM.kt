package com.syedzulqarnainsapplication.app.modules.scanqrcodeone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.scanqrcodeone.`data`.model.ScanQrCodeOneModel
import org.koin.core.KoinComponent

class ScanQrCodeOneVM : ViewModel(), KoinComponent {
  val scanQrCodeOneModel: MutableLiveData<ScanQrCodeOneModel> =
      MutableLiveData(ScanQrCodeOneModel())

  var navArguments: Bundle? = null
}
