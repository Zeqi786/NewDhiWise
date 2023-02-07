package com.syedzulqarnainsapplication.app.modules.addwomanfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.addwomanfive.`data`.model.AddWomanFiveModel
import org.koin.core.KoinComponent

class AddWomanFiveVM : ViewModel(), KoinComponent {
  val addWomanFiveModel: MutableLiveData<AddWomanFiveModel> = MutableLiveData(AddWomanFiveModel())

  var navArguments: Bundle? = null
}
