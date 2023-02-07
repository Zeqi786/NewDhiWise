package com.syedzulqarnainsapplication.app.modules.addwomanfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.addwomanfour.`data`.model.AddWomanFourModel
import org.koin.core.KoinComponent

class AddWomanFourVM : ViewModel(), KoinComponent {
  val addWomanFourModel: MutableLiveData<AddWomanFourModel> = MutableLiveData(AddWomanFourModel())

  var navArguments: Bundle? = null
}
