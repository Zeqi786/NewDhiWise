package com.syedzulqarnainsapplication.app.modules.capturedimagethree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.capturedimagethree.`data`.model.CapturedImageThreeModel
import org.koin.core.KoinComponent

class CapturedImageThreeVM : ViewModel(), KoinComponent {
  val capturedImageThreeModel: MutableLiveData<CapturedImageThreeModel> =
      MutableLiveData(CapturedImageThreeModel())

  var navArguments: Bundle? = null
}
