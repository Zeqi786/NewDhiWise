package com.syedzulqarnainsapplication.app.modules.mobilizationtasks.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityMobilizationTasksBinding
import com.syedzulqarnainsapplication.app.modules.mobilizationtasks.`data`.viewmodel.MobilizationTasksVM
import com.syedzulqarnainsapplication.app.modules.mobilizationtasksalloptions.ui.MobilizationTasksAllOptionsActivity
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class MobilizationTasksActivity :
    BaseActivity<ActivityMobilizationTasksBinding>(R.layout.activity_mobilization_tasks) {
  private val viewModel: MobilizationTasksVM by viewModels<MobilizationTasksVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mobilizationTasksVM = viewModel
    setUpSearchViewComponentListener()
  }

  override fun setUpClicks(): Unit {
    binding.spinnerDropdown.setOnClickListener {
      val destIntent = MobilizationTasksAllOptionsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageClose.setOnClickListener {
      finish()
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
      const val TAG: String = "MOBILIZATION_TASKS_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, MobilizationTasksActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
