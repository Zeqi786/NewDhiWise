package com.syedzulqarnainsapplication.app.modules.refusalbinalloptions.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.refusalbinalloptions.`data`.model.RefusalBinAllOptionsModel
import org.koin.core.KoinComponent

class RefusalBinAllOptionsVM : ViewModel(), KoinComponent {
  val refusalBinAllOptionsModel: MutableLiveData<RefusalBinAllOptionsModel> =
      MutableLiveData(RefusalBinAllOptionsModel())

  var navArguments: Bundle? = null
}
