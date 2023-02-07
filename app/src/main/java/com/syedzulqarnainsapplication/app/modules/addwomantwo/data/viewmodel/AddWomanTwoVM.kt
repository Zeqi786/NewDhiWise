package com.syedzulqarnainsapplication.app.modules.addwomantwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.addwomantwo.`data`.model.AddWomanTwoModel
import org.koin.core.KoinComponent

class AddWomanTwoVM : ViewModel(), KoinComponent {
  val addWomanTwoModel: MutableLiveData<AddWomanTwoModel> = MutableLiveData(AddWomanTwoModel())

  var navArguments: Bundle? = null
}
