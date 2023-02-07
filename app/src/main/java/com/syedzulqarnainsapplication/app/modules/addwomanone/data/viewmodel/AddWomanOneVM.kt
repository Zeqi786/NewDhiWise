package com.syedzulqarnainsapplication.app.modules.addwomanone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.addwomanone.`data`.model.AddWomanOneModel
import org.koin.core.KoinComponent

class AddWomanOneVM : ViewModel(), KoinComponent {
  val addWomanOneModel: MutableLiveData<AddWomanOneModel> = MutableLiveData(AddWomanOneModel())

  var navArguments: Bundle? = null
}
