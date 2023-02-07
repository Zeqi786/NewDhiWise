package com.syedzulqarnainsapplication.app.modules.searchchild1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.searchchild1.`data`.model.SearchChild1Model
import org.koin.core.KoinComponent

class SearchChild1VM : ViewModel(), KoinComponent {
  val searchChild1Model: MutableLiveData<SearchChild1Model> = MutableLiveData(SearchChild1Model())

  var navArguments: Bundle? = null
}
