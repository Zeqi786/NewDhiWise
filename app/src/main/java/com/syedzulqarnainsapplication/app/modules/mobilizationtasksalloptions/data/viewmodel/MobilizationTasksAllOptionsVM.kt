package com.syedzulqarnainsapplication.app.modules.mobilizationtasksalloptions.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.mobilizationtasksalloptions.`data`.model.MobilizationTasksAllOptionsModel
import org.koin.core.KoinComponent

class MobilizationTasksAllOptionsVM : ViewModel(), KoinComponent {
  val mobilizationTasksAllOptionsModel: MutableLiveData<MobilizationTasksAllOptionsModel> =
      MutableLiveData(MobilizationTasksAllOptionsModel())

  var navArguments: Bundle? = null
}
