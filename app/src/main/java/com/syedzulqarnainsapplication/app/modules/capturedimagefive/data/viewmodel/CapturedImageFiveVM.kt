package com.syedzulqarnainsapplication.app.modules.capturedimagefive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.capturedimagefive.`data`.model.CapturedImageFiveModel
import org.koin.core.KoinComponent

class CapturedImageFiveVM : ViewModel(), KoinComponent {
  val capturedImageFiveModel: MutableLiveData<CapturedImageFiveModel> =
      MutableLiveData(CapturedImageFiveModel())

  var navArguments: Bundle? = null
}
