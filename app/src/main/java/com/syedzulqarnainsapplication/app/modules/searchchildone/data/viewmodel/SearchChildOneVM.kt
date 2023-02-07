package com.syedzulqarnainsapplication.app.modules.searchchildone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.searchchildone.`data`.model.SearchChildOneModel
import org.koin.core.KoinComponent

class SearchChildOneVM : ViewModel(), KoinComponent {
  val searchChildOneModel: MutableLiveData<SearchChildOneModel> =
      MutableLiveData(SearchChildOneModel())

  var navArguments: Bundle? = null
}
