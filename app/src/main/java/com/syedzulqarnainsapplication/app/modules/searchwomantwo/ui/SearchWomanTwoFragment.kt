package com.syedzulqarnainsapplication.app.modules.searchwomantwo.ui

import androidx.fragment.app.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseFragment
import com.syedzulqarnainsapplication.app.databinding.FragmentSearchWomanTwoBinding
import com.syedzulqarnainsapplication.app.modules.searchwomantwo.`data`.model.SpinnerFieldFourModel
import com.syedzulqarnainsapplication.app.modules.searchwomantwo.`data`.viewmodel.SearchWomanTwoVM
import kotlin.String
import kotlin.Unit

class SearchWomanTwoFragment :
    BaseFragment<FragmentSearchWomanTwoBinding>(R.layout.fragment_search_woman_two) {
  private val viewModel: SearchWomanTwoVM by viewModels<SearchWomanTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerFieldFourList.value = mutableListOf(
    SpinnerFieldFourModel("Item1"),
    SpinnerFieldFourModel("Item2"),
    SpinnerFieldFourModel("Item3"),
    SpinnerFieldFourModel("Item4"),
    SpinnerFieldFourModel("Item5")
    )
    val spinnerFieldFourAdapter =
    SpinnerFieldFourAdapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerFieldFourList.value?:
    mutableListOf())
    binding.spinnerFieldFour.adapter = spinnerFieldFourAdapter
    binding.searchWomanTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SEARCH_WOMAN_TWO_FRAGMENT"

  }
}
