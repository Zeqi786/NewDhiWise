package com.syedzulqarnainsapplication.app.modules.searchwomantwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.searchwomantwo.`data`.model.SearchWomanTwoModel
import com.syedzulqarnainsapplication.app.modules.searchwomantwo.`data`.model.SpinnerFieldFourModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchWomanTwoVM : ViewModel(), KoinComponent {
  val searchWomanTwoModel: MutableLiveData<SearchWomanTwoModel> =
      MutableLiveData(SearchWomanTwoModel())

  var navArguments: Bundle? = null

  val spinnerFieldFourList: MutableLiveData<MutableList<SpinnerFieldFourModel>> = MutableLiveData()
}
