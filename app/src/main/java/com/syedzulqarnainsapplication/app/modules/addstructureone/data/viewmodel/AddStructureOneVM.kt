package com.syedzulqarnainsapplication.app.modules.addstructureone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.addstructureone.`data`.model.AddStructureOneModel
import org.koin.core.KoinComponent

class AddStructureOneVM : ViewModel(), KoinComponent {
  val addStructureOneModel: MutableLiveData<AddStructureOneModel> =
      MutableLiveData(AddStructureOneModel())

  var navArguments: Bundle? = null
}
