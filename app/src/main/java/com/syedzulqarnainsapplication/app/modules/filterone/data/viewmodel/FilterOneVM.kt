package com.syedzulqarnainsapplication.app.modules.filterone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.filterone.`data`.model.FilterOneModel
import org.koin.core.KoinComponent

class FilterOneVM : ViewModel(), KoinComponent {
  val filterOneModel: MutableLiveData<FilterOneModel> = MutableLiveData(FilterOneModel())

  var navArguments: Bundle? = null
}
