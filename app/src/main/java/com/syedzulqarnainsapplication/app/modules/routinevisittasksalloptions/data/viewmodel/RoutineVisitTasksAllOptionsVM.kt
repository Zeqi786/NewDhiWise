package com.syedzulqarnainsapplication.app.modules.routinevisittasksalloptions.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.routinevisittasksalloptions.`data`.model.RoutineVisitTasksAllOptionsModel
import org.koin.core.KoinComponent

class RoutineVisitTasksAllOptionsVM : ViewModel(), KoinComponent {
  val routineVisitTasksAllOptionsModel: MutableLiveData<RoutineVisitTasksAllOptionsModel> =
      MutableLiveData(RoutineVisitTasksAllOptionsModel())

  var navArguments: Bundle? = null
}
