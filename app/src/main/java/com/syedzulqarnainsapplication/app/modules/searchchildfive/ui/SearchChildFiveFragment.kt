package com.syedzulqarnainsapplication.app.modules.searchchildfive.ui

import androidx.fragment.app.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseFragment
import com.syedzulqarnainsapplication.app.databinding.FragmentSearchChildFiveBinding
import com.syedzulqarnainsapplication.app.modules.searchchildfive.`data`.model.SpinnerFieldTwoModel
import com.syedzulqarnainsapplication.app.modules.searchchildfive.`data`.viewmodel.SearchChildFiveVM
import kotlin.String
import kotlin.Unit

class SearchChildFiveFragment :
    BaseFragment<FragmentSearchChildFiveBinding>(R.layout.fragment_search_child_five) {
  private val viewModel: SearchChildFiveVM by viewModels<SearchChildFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerFieldTwoList.value = mutableListOf(
    SpinnerFieldTwoModel("Item1"),
    SpinnerFieldTwoModel("Item2"),
    SpinnerFieldTwoModel("Item3"),
    SpinnerFieldTwoModel("Item4"),
    SpinnerFieldTwoModel("Item5")
    )
    val spinnerFieldTwoAdapter =
    SpinnerFieldTwoAdapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerFieldTwoList.value?:
    mutableListOf())
    binding.spinnerFieldTwo.adapter = spinnerFieldTwoAdapter
    binding.searchChildFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SEARCH_CHILD_FIVE_FRAGMENT"

  }
}
