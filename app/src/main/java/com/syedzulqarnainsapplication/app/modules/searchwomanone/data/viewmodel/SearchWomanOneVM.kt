package com.syedzulqarnainsapplication.app.modules.searchwomanone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.searchwomanone.`data`.model.SearchWomanOneModel
import org.koin.core.KoinComponent

class SearchWomanOneVM : ViewModel(), KoinComponent {
  val searchWomanOneModel: MutableLiveData<SearchWomanOneModel> =
      MutableLiveData(SearchWomanOneModel())

  var navArguments: Bundle? = null
}
