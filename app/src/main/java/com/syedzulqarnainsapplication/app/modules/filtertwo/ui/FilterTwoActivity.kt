package com.syedzulqarnainsapplication.app.modules.filtertwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityFilterTwoBinding
import com.syedzulqarnainsapplication.app.modules.filter.ui.FilterActivity
import com.syedzulqarnainsapplication.app.modules.filtertwo.`data`.model.SpinnerFieldModel
import com.syedzulqarnainsapplication.app.modules.filtertwo.`data`.viewmodel.FilterTwoVM
import kotlin.String
import kotlin.Unit

class FilterTwoActivity : BaseActivity<ActivityFilterTwoBinding>(R.layout.activity_filter_two) {
  private val viewModel: FilterTwoVM by viewModels<FilterTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerFieldList.value = mutableListOf(
    SpinnerFieldModel("Item1"),
    SpinnerFieldModel("Item2"),
    SpinnerFieldModel("Item3"),
    SpinnerFieldModel("Item4"),
    SpinnerFieldModel("Item5")
    )
    val spinnerFieldAdapter =
    SpinnerFieldAdapter(this,R.layout.spinner_item,viewModel.spinnerFieldList.value?:
    mutableListOf())
    binding.spinnerField.adapter = spinnerFieldAdapter
    binding.filterTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtMenu1Menu2M.setOnClickListener {
      val destIntent = FilterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "FILTER_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FilterTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
