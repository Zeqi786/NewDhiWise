package com.syedzulqarnainsapplication.app.modules.searchwomanone.ui

import androidx.fragment.app.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseFragment
import com.syedzulqarnainsapplication.app.databinding.FragmentSearchWomanOneBinding
import com.syedzulqarnainsapplication.app.modules.searchwomanone.`data`.viewmodel.SearchWomanOneVM
import kotlin.String
import kotlin.Unit

class SearchWomanOneFragment :
    BaseFragment<FragmentSearchWomanOneBinding>(R.layout.fragment_search_woman_one) {
  private val viewModel: SearchWomanOneVM by viewModels<SearchWomanOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.searchWomanOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SEARCH_WOMAN_ONE_FRAGMENT"

  }
}
