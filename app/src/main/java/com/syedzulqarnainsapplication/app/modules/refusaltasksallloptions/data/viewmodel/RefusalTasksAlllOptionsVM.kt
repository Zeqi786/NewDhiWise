package com.syedzulqarnainsapplication.app.modules.refusaltasksallloptions.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.refusaltasksallloptions.`data`.model.RefusalTasksAlllOptionsModel
import org.koin.core.KoinComponent

class RefusalTasksAlllOptionsVM : ViewModel(), KoinComponent {
  val refusalTasksAlllOptionsModel: MutableLiveData<RefusalTasksAlllOptionsModel> =
      MutableLiveData(RefusalTasksAlllOptionsModel())

  var navArguments: Bundle? = null
}
