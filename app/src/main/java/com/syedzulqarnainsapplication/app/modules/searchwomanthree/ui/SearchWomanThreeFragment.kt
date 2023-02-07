package com.syedzulqarnainsapplication.app.modules.searchwomanthree.ui

import androidx.fragment.app.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseFragment
import com.syedzulqarnainsapplication.app.databinding.FragmentSearchWomanThreeBinding
import com.syedzulqarnainsapplication.app.modules.familyprofile.ui.FamilyProfileActivity
import com.syedzulqarnainsapplication.app.modules.searchwomanthree.`data`.viewmodel.SearchWomanThreeVM
import kotlin.String
import kotlin.Unit

class SearchWomanThreeFragment :
    BaseFragment<FragmentSearchWomanThreeBinding>(R.layout.fragment_search_woman_three) {
  private val viewModel: SearchWomanThreeVM by viewModels<SearchWomanThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.searchWomanThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearCard.setOnClickListener {
      val destIntent = FamilyProfileActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "SEARCH_WOMAN_THREE_FRAGMENT"

  }
}
