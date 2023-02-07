package com.syedzulqarnainsapplication.app.modules.filterone.ui

import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityFilterOneBinding
import com.syedzulqarnainsapplication.app.modules.filterone.`data`.viewmodel.FilterOneVM
import com.syedzulqarnainsapplication.app.modules.filtertwo.ui.FilterTwoActivity
import kotlin.String
import kotlin.Unit

class FilterOneActivity : BaseActivity<ActivityFilterOneBinding>(R.layout.activity_filter_one) {
  private val viewModel: FilterOneVM by viewModels<FilterOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.filterOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.spinnerField.setOnClickListener {
      val destIntent = FilterTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "FILTER_ONE_ACTIVITY"

  }
}
