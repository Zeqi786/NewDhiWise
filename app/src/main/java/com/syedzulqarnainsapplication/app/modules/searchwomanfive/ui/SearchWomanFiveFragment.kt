package com.syedzulqarnainsapplication.app.modules.searchwomanfive.ui

import androidx.fragment.app.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseFragment
import com.syedzulqarnainsapplication.app.databinding.FragmentSearchWomanFiveBinding
import com.syedzulqarnainsapplication.app.modules.searchwomanfive.`data`.viewmodel.SearchWomanFiveVM
import kotlin.String
import kotlin.Unit

class SearchWomanFiveFragment :
    BaseFragment<FragmentSearchWomanFiveBinding>(R.layout.fragment_search_woman_five) {
  private val viewModel: SearchWomanFiveVM by viewModels<SearchWomanFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.searchWomanFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SEARCH_WOMAN_FIVE_FRAGMENT"

  }
}
