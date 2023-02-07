package com.syedzulqarnainsapplication.app.modules.routinevisittasks.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.routinevisittasks.`data`.model.RoutineVisitTasksModel
import org.koin.core.KoinComponent

class RoutineVisitTasksVM : ViewModel(), KoinComponent {
  val routineVisitTasksModel: MutableLiveData<RoutineVisitTasksModel> =
      MutableLiveData(RoutineVisitTasksModel())

  var navArguments: Bundle? = null
}
