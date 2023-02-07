package com.syedzulqarnainsapplication.app.modules.capturedimagetwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.capturedimagetwo.`data`.model.CapturedImageTwoModel
import org.koin.core.KoinComponent

class CapturedImageTwoVM : ViewModel(), KoinComponent {
  val capturedImageTwoModel: MutableLiveData<CapturedImageTwoModel> =
      MutableLiveData(CapturedImageTwoModel())

  var navArguments: Bundle? = null
}
