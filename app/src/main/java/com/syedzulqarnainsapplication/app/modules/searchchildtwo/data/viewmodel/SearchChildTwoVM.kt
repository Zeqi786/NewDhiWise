package com.syedzulqarnainsapplication.app.modules.searchchildtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.searchchildtwo.`data`.model.SearchChildTwoModel
import org.koin.core.KoinComponent

class SearchChildTwoVM : ViewModel(), KoinComponent {
  val searchChildTwoModel: MutableLiveData<SearchChildTwoModel> =
      MutableLiveData(SearchChildTwoModel())

  var navArguments: Bundle? = null
}
