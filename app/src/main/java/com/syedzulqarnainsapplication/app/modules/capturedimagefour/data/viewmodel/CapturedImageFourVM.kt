package com.syedzulqarnainsapplication.app.modules.capturedimagefour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.capturedimagefour.`data`.model.CapturedImageFourModel
import org.koin.core.KoinComponent

class CapturedImageFourVM : ViewModel(), KoinComponent {
  val capturedImageFourModel: MutableLiveData<CapturedImageFourModel> =
      MutableLiveData(CapturedImageFourModel())

  var navArguments: Bundle? = null
}
