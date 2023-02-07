package com.syedzulqarnainsapplication.app.modules.capturedimageone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.capturedimageone.`data`.model.CapturedImageOneModel
import org.koin.core.KoinComponent

class CapturedImageOneVM : ViewModel(), KoinComponent {
  val capturedImageOneModel: MutableLiveData<CapturedImageOneModel> =
      MutableLiveData(CapturedImageOneModel())

  var navArguments: Bundle? = null
}
