package com.syedzulqarnainsapplication.app.modules.refusalbin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.refusalbin.`data`.model.RefusalBinModel
import org.koin.core.KoinComponent

class RefusalBinVM : ViewModel(), KoinComponent {
  val refusalBinModel: MutableLiveData<RefusalBinModel> = MutableLiveData(RefusalBinModel())

  var navArguments: Bundle? = null
}
