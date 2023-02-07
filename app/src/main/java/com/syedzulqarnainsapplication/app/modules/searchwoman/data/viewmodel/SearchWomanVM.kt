package com.syedzulqarnainsapplication.app.modules.searchwoman.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.searchwoman.`data`.model.SearchWomanModel
import org.koin.core.KoinComponent

class SearchWomanVM : ViewModel(), KoinComponent {
  val searchWomanModel: MutableLiveData<SearchWomanModel> = MutableLiveData(SearchWomanModel())

  var navArguments: Bundle? = null
}
