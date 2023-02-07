package com.syedzulqarnainsapplication.app.modules.scanqrcodethree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.scanqrcodethree.`data`.model.ScanQrCodeThreeModel
import org.koin.core.KoinComponent

class ScanQrCodeThreeVM : ViewModel(), KoinComponent {
  val scanQrCodeThreeModel: MutableLiveData<ScanQrCodeThreeModel> =
      MutableLiveData(ScanQrCodeThreeModel())

  var navArguments: Bundle? = null
}
