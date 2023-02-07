package com.syedzulqarnainsapplication.app.modules.routinevisittasksalloptions.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityRoutineVisitTasksAllOptionsBinding
import com.syedzulqarnainsapplication.app.modules.routinevisittasks.ui.RoutineVisitTasksActivity
import com.syedzulqarnainsapplication.app.modules.routinevisittasksalloptions.`data`.viewmodel.RoutineVisitTasksAllOptionsVM
import kotlin.String
import kotlin.Unit

class RoutineVisitTasksAllOptionsActivity :
    BaseActivity<ActivityRoutineVisitTasksAllOptionsBinding>(R.layout.activity_routine_visit_tasks_all_options)
    {
  private val viewModel: RoutineVisitTasksAllOptionsVM by
      viewModels<RoutineVisitTasksAllOptionsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.routineVisitTasksAllOptionsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      finish()
    }
    binding.spinnerDropdown.setOnClickListener {
      val destIntent = RoutineVisitTasksActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ROUTINE_VISIT_TASKS_ALL_OPTIONS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RoutineVisitTasksAllOptionsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
