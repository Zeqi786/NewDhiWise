package com.syedzulqarnainsapplication.app.modules.capturedimage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.capturedimage.`data`.model.CapturedImageModel
import org.koin.core.KoinComponent

class CapturedImageVM : ViewModel(), KoinComponent {
  val capturedImageModel: MutableLiveData<CapturedImageModel> =
      MutableLiveData(CapturedImageModel())

  var navArguments: Bundle? = null
}
