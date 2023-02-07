package com.syedzulqarnainsapplication.app.modules.refusaltasksallloptions.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityRefusalTasksAlllOptionsBinding
import com.syedzulqarnainsapplication.app.modules.refusaltasks.ui.RefusalTasksActivity
import com.syedzulqarnainsapplication.app.modules.refusaltasksallloptions.`data`.viewmodel.RefusalTasksAlllOptionsVM
import kotlin.String
import kotlin.Unit

class RefusalTasksAlllOptionsActivity :
    BaseActivity<ActivityRefusalTasksAlllOptionsBinding>(R.layout.activity_refusal_tasks_alll_options)
    {
  private val viewModel: RefusalTasksAlllOptionsVM by viewModels<RefusalTasksAlllOptionsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.refusalTasksAlllOptionsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      finish()
    }
    binding.spinnerDropdown.setOnClickListener {
      val destIntent = RefusalTasksActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REFUSAL_TASKS_ALLL_OPTIONS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RefusalTasksAlllOptionsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
