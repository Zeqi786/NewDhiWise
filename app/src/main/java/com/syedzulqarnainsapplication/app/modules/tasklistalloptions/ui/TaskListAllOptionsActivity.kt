package com.syedzulqarnainsapplication.app.modules.tasklistalloptions.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityTaskListAllOptionsBinding
import com.syedzulqarnainsapplication.app.modules.tasklistalloptions.`data`.viewmodel.TaskListAllOptionsVM
import com.syedzulqarnainsapplication.app.modules.tasklistone.ui.TaskListOneActivity
import kotlin.String
import kotlin.Unit

class TaskListAllOptionsActivity :
    BaseActivity<ActivityTaskListAllOptionsBinding>(R.layout.activity_task_list_all_options) {
  private val viewModel: TaskListAllOptionsVM by viewModels<TaskListAllOptionsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.taskListAllOptionsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      finish()
    }
    binding.spinnerDropdown.setOnClickListener {
      val destIntent = TaskListOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TASK_LIST_ALL_OPTIONS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TaskListAllOptionsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
