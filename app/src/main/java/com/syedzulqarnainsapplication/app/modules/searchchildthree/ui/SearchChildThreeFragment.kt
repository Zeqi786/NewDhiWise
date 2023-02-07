package com.syedzulqarnainsapplication.app.modules.searchchildthree.ui

import androidx.fragment.app.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseFragment
import com.syedzulqarnainsapplication.app.databinding.FragmentSearchChildThreeBinding
import com.syedzulqarnainsapplication.app.modules.searchchildthree.`data`.viewmodel.SearchChildThreeVM
import kotlin.String
import kotlin.Unit

class SearchChildThreeFragment :
    BaseFragment<FragmentSearchChildThreeBinding>(R.layout.fragment_search_child_three) {
  private val viewModel: SearchChildThreeVM by viewModels<SearchChildThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.searchChildThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SEARCH_CHILD_THREE_FRAGMENT"

  }
}
