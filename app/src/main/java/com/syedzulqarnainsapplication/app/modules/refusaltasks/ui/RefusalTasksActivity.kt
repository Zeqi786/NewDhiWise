package com.syedzulqarnainsapplication.app.modules.refusaltasks.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityRefusalTasksBinding
import com.syedzulqarnainsapplication.app.modules.refusaltasks.`data`.viewmodel.RefusalTasksVM
import com.syedzulqarnainsapplication.app.modules.refusaltasksallloptions.ui.RefusalTasksAlllOptionsActivity
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class RefusalTasksActivity :
    BaseActivity<ActivityRefusalTasksBinding>(R.layout.activity_refusal_tasks) {
  private val viewModel: RefusalTasksVM by viewModels<RefusalTasksVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.refusalTasksVM = viewModel
    setUpSearchViewComponentListener()
  }

  override fun setUpClicks(): Unit {
    binding.spinnerDropdown.setOnClickListener {
      val destIntent = RefusalTasksAlllOptionsActivity.getIntent(this, null)
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
      const val TAG: String = "REFUSAL_TASKS_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, RefusalTasksActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
