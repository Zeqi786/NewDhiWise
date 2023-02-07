package com.syedzulqarnainsapplication.app.modules.searchwomansix.ui

import androidx.fragment.app.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseFragment
import com.syedzulqarnainsapplication.app.databinding.FragmentSearchWomanSixBinding
import com.syedzulqarnainsapplication.app.modules.familyprofile.ui.FamilyProfileActivity
import com.syedzulqarnainsapplication.app.modules.searchwomansix.`data`.viewmodel.SearchWomanSixVM
import kotlin.String
import kotlin.Unit

class SearchWomanSixFragment :
    BaseFragment<FragmentSearchWomanSixBinding>(R.layout.fragment_search_woman_six) {
  private val viewModel: SearchWomanSixVM by viewModels<SearchWomanSixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.searchWomanSixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearCard.setOnClickListener {
      val destIntent = FamilyProfileActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "SEARCH_WOMAN_SIX_FRAGMENT"

  }
}
