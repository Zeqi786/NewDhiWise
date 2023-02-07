package com.syedzulqarnainsapplication.app.modules.searchwomanthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.searchwomanthree.`data`.model.SearchWomanThreeModel
import org.koin.core.KoinComponent

class SearchWomanThreeVM : ViewModel(), KoinComponent {
  val searchWomanThreeModel: MutableLiveData<SearchWomanThreeModel> =
      MutableLiveData(SearchWomanThreeModel())

  var navArguments: Bundle? = null
}
