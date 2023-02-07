package com.syedzulqarnainsapplication.app.modules.addchild.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.addchild.`data`.model.AddChildModel
import org.koin.core.KoinComponent

class AddChildVM : ViewModel(), KoinComponent {
  val addChildModel: MutableLiveData<AddChildModel> = MutableLiveData(AddChildModel())

  var navArguments: Bundle? = null
}
