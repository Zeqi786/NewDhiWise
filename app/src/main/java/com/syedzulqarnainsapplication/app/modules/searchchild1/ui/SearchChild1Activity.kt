package com.syedzulqarnainsapplication.app.modules.searchchild1.ui

import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivitySearchChild1Binding
import com.syedzulqarnainsapplication.app.modules.searchchild1.`data`.viewmodel.SearchChild1VM
import kotlin.String
import kotlin.Unit

class SearchChild1Activity :
    BaseActivity<ActivitySearchChild1Binding>(R.layout.activity_search_child1) {
  private val viewModel: SearchChild1VM by viewModels<SearchChild1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.searchChild1VM = viewModel
    val adapter = SearchChild1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerViewpager.adapter = adapter
    TabLayoutMediator(binding.tabLayoutRow,binding.viewPagerViewpager) { tab, position ->
      tab.text = SearchChild1ActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "SEARCH_CHILD1ACTIVITY"

    }
  }
