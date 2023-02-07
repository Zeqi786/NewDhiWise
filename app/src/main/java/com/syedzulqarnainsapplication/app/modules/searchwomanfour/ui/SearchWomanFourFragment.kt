package com.syedzulqarnainsapplication.app.modules.searchwomanfour.ui

import androidx.fragment.app.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseFragment
import com.syedzulqarnainsapplication.app.databinding.FragmentSearchWomanFourBinding
import com.syedzulqarnainsapplication.app.modules.searchwomanfour.`data`.viewmodel.SearchWomanFourVM
import kotlin.String
import kotlin.Unit

class SearchWomanFourFragment :
    BaseFragment<FragmentSearchWomanFourBinding>(R.layout.fragment_search_woman_four) {
  private val viewModel: SearchWomanFourVM by viewModels<SearchWomanFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.searchWomanFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SEARCH_WOMAN_FOUR_FRAGMENT"

  }
}
