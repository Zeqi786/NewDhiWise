package com.syedzulqarnainsapplication.app.modules.addwomanthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.addwomanthree.`data`.model.AddWomanThreeModel
import org.koin.core.KoinComponent

class AddWomanThreeVM : ViewModel(), KoinComponent {
  val addWomanThreeModel: MutableLiveData<AddWomanThreeModel> =
      MutableLiveData(AddWomanThreeModel())

  var navArguments: Bundle? = null
}
