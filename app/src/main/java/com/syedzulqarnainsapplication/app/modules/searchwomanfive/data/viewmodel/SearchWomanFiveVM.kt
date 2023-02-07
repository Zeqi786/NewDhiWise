package com.syedzulqarnainsapplication.app.modules.searchwomanfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.searchwomanfive.`data`.model.SearchWomanFiveModel
import org.koin.core.KoinComponent

class SearchWomanFiveVM : ViewModel(), KoinComponent {
  val searchWomanFiveModel: MutableLiveData<SearchWomanFiveModel> =
      MutableLiveData(SearchWomanFiveModel())

  var navArguments: Bundle? = null
}
