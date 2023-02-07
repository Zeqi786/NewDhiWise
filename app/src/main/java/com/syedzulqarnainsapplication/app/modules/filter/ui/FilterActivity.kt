package com.syedzulqarnainsapplication.app.modules.filter.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityFilterBinding
import com.syedzulqarnainsapplication.app.modules.filter.`data`.viewmodel.FilterVM
import com.syedzulqarnainsapplication.app.modules.filtertwo.ui.FilterTwoActivity
import com.syedzulqarnainsapplication.app.modules.tasklistone.ui.TaskListOneActivity
import kotlin.String
import kotlin.Unit

class FilterActivity : BaseActivity<ActivityFilterBinding>(R.layout.activity_filter) {
  private val viewModel: FilterVM by viewModels<FilterVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.filterVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.spinnerField.setOnClickListener {
      val destIntent = FilterTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnApplyFilter.setOnClickListener {
      val destIntent = TaskListOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FILTER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FilterActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
