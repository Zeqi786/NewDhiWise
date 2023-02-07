package com.syedzulqarnainsapplication.app.modules.searchchildsix.ui

import androidx.fragment.app.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseFragment
import com.syedzulqarnainsapplication.app.databinding.FragmentSearchChildSixBinding
import com.syedzulqarnainsapplication.app.modules.searchchildsix.`data`.viewmodel.SearchChildSixVM
import kotlin.String
import kotlin.Unit

class SearchChildSixFragment :
    BaseFragment<FragmentSearchChildSixBinding>(R.layout.fragment_search_child_six) {
  private val viewModel: SearchChildSixVM by viewModels<SearchChildSixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.searchChildSixVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SEARCH_CHILD_SIX_FRAGMENT"

  }
}
