package com.syedzulqarnainsapplication.app.modules.tasklisttwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityTaskListTwoBinding
import com.syedzulqarnainsapplication.app.modules.followuptaskthree.ui.FollowUpTaskThreeActivity
import com.syedzulqarnainsapplication.app.modules.tasklisttwo.`data`.viewmodel.TaskListTwoVM
import kotlin.String
import kotlin.Unit

class TaskListTwoActivity :
    BaseActivity<ActivityTaskListTwoBinding>(R.layout.activity_task_list_two) {
  private val viewModel: TaskListTwoVM by viewModels<TaskListTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.taskListTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowcomponentone.setOnClickListener {
      val destIntent = FollowUpTaskThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TASK_LIST_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TaskListTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
