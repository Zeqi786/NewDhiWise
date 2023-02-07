package com.syedzulqarnainsapplication.app.modules.searchchildfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.searchchildfive.`data`.model.SearchChildFiveModel
import com.syedzulqarnainsapplication.app.modules.searchchildfive.`data`.model.SpinnerFieldTwoModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchChildFiveVM : ViewModel(), KoinComponent {
  val searchChildFiveModel: MutableLiveData<SearchChildFiveModel> =
      MutableLiveData(SearchChildFiveModel())

  var navArguments: Bundle? = null

  val spinnerFieldTwoList: MutableLiveData<MutableList<SpinnerFieldTwoModel>> = MutableLiveData()
}
