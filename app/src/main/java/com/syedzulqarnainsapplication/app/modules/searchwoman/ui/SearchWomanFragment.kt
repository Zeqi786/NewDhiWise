package com.syedzulqarnainsapplication.app.modules.searchwoman.ui

import androidx.fragment.app.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseFragment
import com.syedzulqarnainsapplication.app.databinding.FragmentSearchWomanBinding
import com.syedzulqarnainsapplication.app.modules.searchwoman.`data`.viewmodel.SearchWomanVM
import kotlin.String
import kotlin.Unit

class SearchWomanFragment : BaseFragment<FragmentSearchWomanBinding>(R.layout.fragment_search_woman)
    {
  private val viewModel: SearchWomanVM by viewModels<SearchWomanVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.searchWomanVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SEARCH_WOMAN_FRAGMENT"

  }
}
