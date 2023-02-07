package com.syedzulqarnainsapplication.app.modules.searchchild.ui

import androidx.fragment.app.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseFragment
import com.syedzulqarnainsapplication.app.databinding.FragmentSearchChildBinding
import com.syedzulqarnainsapplication.app.modules.searchchild.`data`.viewmodel.SearchChildVM
import kotlin.String
import kotlin.Unit

class SearchChildFragment : BaseFragment<FragmentSearchChildBinding>(R.layout.fragment_search_child)
    {
  private val viewModel: SearchChildVM by viewModels<SearchChildVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.searchChildVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SEARCH_CHILD_FRAGMENT"

  }
}
