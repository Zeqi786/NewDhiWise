package com.syedzulqarnainsapplication.app.modules.filtertwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.filtertwo.`data`.model.FilterTwoModel
import com.syedzulqarnainsapplication.app.modules.filtertwo.`data`.model.SpinnerFieldModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FilterTwoVM : ViewModel(), KoinComponent {
  val filterTwoModel: MutableLiveData<FilterTwoModel> = MutableLiveData(FilterTwoModel())

  var navArguments: Bundle? = null

  val spinnerFieldList: MutableLiveData<MutableList<SpinnerFieldModel>> = MutableLiveData()
}
