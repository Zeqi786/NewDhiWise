package com.syedzulqarnainsapplication.app.modules.tasklist.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.tasklist.`data`.model.TaskListModel
import org.koin.core.KoinComponent

class TaskListVM : ViewModel(), KoinComponent {
  val taskListModel: MutableLiveData<TaskListModel> = MutableLiveData(TaskListModel())

  var navArguments: Bundle? = null
}
