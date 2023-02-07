package com.syedzulqarnainsapplication.app.modules.addstructuretwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.addstructuretwo.`data`.model.AddStructureTwoModel
import org.koin.core.KoinComponent

class AddStructureTwoVM : ViewModel(), KoinComponent {
  val addStructureTwoModel: MutableLiveData<AddStructureTwoModel> =
      MutableLiveData(AddStructureTwoModel())

  var navArguments: Bundle? = null
}
