package com.syedzulqarnainsapplication.app.modules.searchchildsix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.searchchildsix.`data`.model.SearchChildSixModel
import org.koin.core.KoinComponent

class SearchChildSixVM : ViewModel(), KoinComponent {
  val searchChildSixModel: MutableLiveData<SearchChildSixModel> =
      MutableLiveData(SearchChildSixModel())

  var navArguments: Bundle? = null
}
