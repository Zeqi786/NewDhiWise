package com.syedzulqarnainsapplication.app.modules.tasklist.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityTaskListBinding
import com.syedzulqarnainsapplication.app.modules.childtaskdefault.ui.ChildTaskDefaultActivity
import com.syedzulqarnainsapplication.app.modules.tasklist.`data`.viewmodel.TaskListVM
import com.syedzulqarnainsapplication.app.modules.tasklistalloptions.ui.TaskListAllOptionsActivity
import com.syedzulqarnainsapplication.app.modules.tasklistone.ui.TaskListOneActivity
import kotlin.String
import kotlin.Unit

class TaskListActivity : BaseActivity<ActivityTaskListBinding>(R.layout.activity_task_list) {
  private val viewModel: TaskListVM by viewModels<TaskListVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.taskListVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowsettings.setOnClickListener {
      val destIntent = ChildTaskDefaultActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageClose.setOnClickListener {
      finish()
    }
    binding.spinnerDropdown.setOnClickListener {
      val destIntent = TaskListAllOptionsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.searchViewComponent.setOnClickListener {
      val destIntent = TaskListOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TASK_LIST_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TaskListActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
