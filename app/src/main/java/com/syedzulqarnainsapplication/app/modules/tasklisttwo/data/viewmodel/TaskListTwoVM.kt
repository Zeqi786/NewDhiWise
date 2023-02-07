package com.syedzulqarnainsapplication.app.modules.tasklisttwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.tasklisttwo.`data`.model.TaskListTwoModel
import org.koin.core.KoinComponent

class TaskListTwoVM : ViewModel(), KoinComponent {
  val taskListTwoModel: MutableLiveData<TaskListTwoModel> = MutableLiveData(TaskListTwoModel())

  var navArguments: Bundle? = null
}
