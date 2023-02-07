package com.syedzulqarnainsapplication.app.modules.searchchildfour.ui

import androidx.fragment.app.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseFragment
import com.syedzulqarnainsapplication.app.databinding.FragmentSearchChildFourBinding
import com.syedzulqarnainsapplication.app.modules.searchchildfour.`data`.viewmodel.SearchChildFourVM
import kotlin.String
import kotlin.Unit

class SearchChildFourFragment :
    BaseFragment<FragmentSearchChildFourBinding>(R.layout.fragment_search_child_four) {
  private val viewModel: SearchChildFourVM by viewModels<SearchChildFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.searchChildFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SEARCH_CHILD_FOUR_FRAGMENT"

  }
}
