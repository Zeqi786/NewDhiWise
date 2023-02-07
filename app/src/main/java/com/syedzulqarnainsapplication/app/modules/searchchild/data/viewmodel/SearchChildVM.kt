package com.syedzulqarnainsapplication.app.modules.searchchild.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.searchchild.`data`.model.SearchChildModel
import org.koin.core.KoinComponent

class SearchChildVM : ViewModel(), KoinComponent {
  val searchChildModel: MutableLiveData<SearchChildModel> = MutableLiveData(SearchChildModel())

  var navArguments: Bundle? = null
}
