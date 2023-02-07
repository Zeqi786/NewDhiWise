package com.syedzulqarnainsapplication.app.modules.tasklistalloptions.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.tasklistalloptions.`data`.model.TaskListAllOptionsModel
import org.koin.core.KoinComponent

class TaskListAllOptionsVM : ViewModel(), KoinComponent {
  val taskListAllOptionsModel: MutableLiveData<TaskListAllOptionsModel> =
      MutableLiveData(TaskListAllOptionsModel())

  var navArguments: Bundle? = null
}
