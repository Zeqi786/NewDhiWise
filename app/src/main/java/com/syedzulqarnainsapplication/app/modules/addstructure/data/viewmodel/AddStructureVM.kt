package com.syedzulqarnainsapplication.app.modules.addstructure.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.addstructure.`data`.model.AddStructureModel
import org.koin.core.KoinComponent

class AddStructureVM : ViewModel(), KoinComponent {
  val addStructureModel: MutableLiveData<AddStructureModel> = MutableLiveData(AddStructureModel())

  var navArguments: Bundle? = null
}
