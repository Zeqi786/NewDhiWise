package com.syedzulqarnainsapplication.app.modules.searchwomanfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.searchwomanfour.`data`.model.SearchWomanFourModel
import org.koin.core.KoinComponent

class SearchWomanFourVM : ViewModel(), KoinComponent {
  val searchWomanFourModel: MutableLiveData<SearchWomanFourModel> =
      MutableLiveData(SearchWomanFourModel())

  var navArguments: Bundle? = null
}
