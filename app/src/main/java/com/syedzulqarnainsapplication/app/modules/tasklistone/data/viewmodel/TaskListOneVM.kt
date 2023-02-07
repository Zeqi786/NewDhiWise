package com.syedzulqarnainsapplication.app.modules.tasklistone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.tasklistone.`data`.model.TaskListOneModel
import org.koin.core.KoinComponent

class TaskListOneVM : ViewModel(), KoinComponent {
  val taskListOneModel: MutableLiveData<TaskListOneModel> = MutableLiveData(TaskListOneModel())

  var navArguments: Bundle? = null
}
