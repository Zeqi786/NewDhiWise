package com.syedzulqarnainsapplication.app.modules.searchchildthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.searchchildthree.`data`.model.SearchChildThreeModel
import org.koin.core.KoinComponent

class SearchChildThreeVM : ViewModel(), KoinComponent {
  val searchChildThreeModel: MutableLiveData<SearchChildThreeModel> =
      MutableLiveData(SearchChildThreeModel())

  var navArguments: Bundle? = null
}
