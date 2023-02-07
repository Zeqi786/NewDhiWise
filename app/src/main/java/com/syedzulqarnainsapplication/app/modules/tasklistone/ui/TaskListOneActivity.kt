package com.syedzulqarnainsapplication.app.modules.tasklistone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityTaskListOneBinding
import com.syedzulqarnainsapplication.app.modules.childtaskdefault.ui.ChildTaskDefaultActivity
import com.syedzulqarnainsapplication.app.modules.tasklist.ui.TaskListActivity
import com.syedzulqarnainsapplication.app.modules.tasklistalloptions.ui.TaskListAllOptionsActivity
import com.syedzulqarnainsapplication.app.modules.tasklistone.`data`.viewmodel.TaskListOneVM
import kotlin.String
import kotlin.Unit

class TaskListOneActivity :
    BaseActivity<ActivityTaskListOneBinding>(R.layout.activity_task_list_one) {
  private val viewModel: TaskListOneVM by viewModels<TaskListOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.taskListOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      finish()
    }
    binding.searchViewComponent.setOnClickListener {
      val destIntent = TaskListActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.spinnerDropdown.setOnClickListener {
      val destIntent = TaskListAllOptionsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowsettings.setOnClickListener {
      val destIntent = ChildTaskDefaultActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TASK_LIST_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TaskListOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
