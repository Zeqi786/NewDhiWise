package com.syedzulqarnainsapplication.app.modules.mobilizationtasksalloptions.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityMobilizationTasksAllOptionsBinding
import com.syedzulqarnainsapplication.app.modules.mobilizationtasks.ui.MobilizationTasksActivity
import com.syedzulqarnainsapplication.app.modules.mobilizationtasksalloptions.`data`.viewmodel.MobilizationTasksAllOptionsVM
import kotlin.String
import kotlin.Unit

class MobilizationTasksAllOptionsActivity :
    BaseActivity<ActivityMobilizationTasksAllOptionsBinding>(R.layout.activity_mobilization_tasks_all_options)
    {
  private val viewModel: MobilizationTasksAllOptionsVM by
      viewModels<MobilizationTasksAllOptionsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mobilizationTasksAllOptionsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.spinnerDropdown.setOnClickListener {
      val destIntent = MobilizationTasksActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageClose.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "MOBILIZATION_TASKS_ALL_OPTIONS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MobilizationTasksAllOptionsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
