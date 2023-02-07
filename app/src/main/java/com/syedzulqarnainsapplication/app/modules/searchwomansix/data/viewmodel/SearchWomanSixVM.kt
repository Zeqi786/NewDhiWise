package com.syedzulqarnainsapplication.app.modules.searchwomansix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.searchwomansix.`data`.model.SearchWomanSixModel
import org.koin.core.KoinComponent

class SearchWomanSixVM : ViewModel(), KoinComponent {
  val searchWomanSixModel: MutableLiveData<SearchWomanSixModel> =
      MutableLiveData(SearchWomanSixModel())

  var navArguments: Bundle? = null
}
