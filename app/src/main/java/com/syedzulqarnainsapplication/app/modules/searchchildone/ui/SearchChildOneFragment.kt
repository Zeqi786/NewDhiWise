package com.syedzulqarnainsapplication.app.modules.searchchildone.ui

import androidx.fragment.app.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseFragment
import com.syedzulqarnainsapplication.app.databinding.FragmentSearchChildOneBinding
import com.syedzulqarnainsapplication.app.modules.childprofileone.ui.ChildProfileOneActivity
import com.syedzulqarnainsapplication.app.modules.searchchildone.`data`.viewmodel.SearchChildOneVM
import kotlin.String
import kotlin.Unit

class SearchChildOneFragment :
    BaseFragment<FragmentSearchChildOneBinding>(R.layout.fragment_search_child_one) {
  private val viewModel: SearchChildOneVM by viewModels<SearchChildOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.searchChildOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowsettings.setOnClickListener {
      val destIntent = ChildProfileOneActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "SEARCH_CHILD_ONE_FRAGMENT"

  }
}
