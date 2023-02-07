package com.syedzulqarnainsapplication.app.modules.searchchildfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.searchchildfour.`data`.model.SearchChildFourModel
import org.koin.core.KoinComponent

class SearchChildFourVM : ViewModel(), KoinComponent {
  val searchChildFourModel: MutableLiveData<SearchChildFourModel> =
      MutableLiveData(SearchChildFourModel())

  var navArguments: Bundle? = null
}
