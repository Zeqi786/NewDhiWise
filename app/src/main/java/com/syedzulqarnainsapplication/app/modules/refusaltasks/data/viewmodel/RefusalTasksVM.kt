package com.syedzulqarnainsapplication.app.modules.refusaltasks.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.refusaltasks.`data`.model.RefusalTasksModel
import org.koin.core.KoinComponent

class RefusalTasksVM : ViewModel(), KoinComponent {
  val refusalTasksModel: MutableLiveData<RefusalTasksModel> = MutableLiveData(RefusalTasksModel())

  var navArguments: Bundle? = null
}
