package com.syedzulqarnainsapplication.app.modules.addchildone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.addchildone.`data`.model.AddChildOneModel
import org.koin.core.KoinComponent

class AddChildOneVM : ViewModel(), KoinComponent {
  val addChildOneModel: MutableLiveData<AddChildOneModel> = MutableLiveData(AddChildOneModel())

  var navArguments: Bundle? = null
}
