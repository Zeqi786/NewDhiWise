package com.syedzulqarnainsapplication.app.modules.routinevisittasks.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityRoutineVisitTasksBinding
import com.syedzulqarnainsapplication.app.modules.routinevisittasks.`data`.viewmodel.RoutineVisitTasksVM
import com.syedzulqarnainsapplication.app.modules.routinevisittasksalloptions.ui.RoutineVisitTasksAllOptionsActivity
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class RoutineVisitTasksActivity :
    BaseActivity<ActivityRoutineVisitTasksBinding>(R.layout.activity_routine_visit_tasks) {
  private val viewModel: RoutineVisitTasksVM by viewModels<RoutineVisitTasksVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.routineVisitTasksVM = viewModel
    setUpSearchViewComponentListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      finish()
    }
    binding.spinnerDropdown.setOnClickListener {
      val destIntent = RoutineVisitTasksAllOptionsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  private fun setUpSearchViewComponentListener(): Unit {
    binding.searchViewComponent.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "ROUTINE_VISIT_TASKS_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, RoutineVisitTasksActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
