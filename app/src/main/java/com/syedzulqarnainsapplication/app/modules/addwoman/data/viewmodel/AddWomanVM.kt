package com.syedzulqarnainsapplication.app.modules.addwoman.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.addwoman.`data`.model.AddWomanModel
import org.koin.core.KoinComponent

class AddWomanVM : ViewModel(), KoinComponent {
  val addWomanModel: MutableLiveData<AddWomanModel> = MutableLiveData(AddWomanModel())

  var navArguments: Bundle? = null
}
