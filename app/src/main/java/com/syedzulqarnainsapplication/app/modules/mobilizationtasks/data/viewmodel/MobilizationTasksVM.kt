package com.syedzulqarnainsapplication.app.modules.mobilizationtasks.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.mobilizationtasks.`data`.model.MobilizationTasksModel
import org.koin.core.KoinComponent

class MobilizationTasksVM : ViewModel(), KoinComponent {
  val mobilizationTasksModel: MutableLiveData<MobilizationTasksModel> =
      MutableLiveData(MobilizationTasksModel())

  var navArguments: Bundle? = null
}
