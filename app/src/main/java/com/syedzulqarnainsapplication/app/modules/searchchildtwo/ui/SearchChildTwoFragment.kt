package com.syedzulqarnainsapplication.app.modules.searchchildtwo.ui

import androidx.fragment.app.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseFragment
import com.syedzulqarnainsapplication.app.databinding.FragmentSearchChildTwoBinding
import com.syedzulqarnainsapplication.app.modules.searchchildtwo.`data`.viewmodel.SearchChildTwoVM
import kotlin.String
import kotlin.Unit

class SearchChildTwoFragment :
    BaseFragment<FragmentSearchChildTwoBinding>(R.layout.fragment_search_child_two) {
  private val viewModel: SearchChildTwoVM by viewModels<SearchChildTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.searchChildTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SEARCH_CHILD_TWO_FRAGMENT"

  }
}
