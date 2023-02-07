package com.syedzulqarnainsapplication.app.modules.followuptaskone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.followuptaskone.`data`.model.FollowUpTaskOneModel
import com.syedzulqarnainsapplication.app.modules.followuptaskone.`data`.model.Listmohalla1RowModel
import com.syedzulqarnainsapplication.app.modules.followuptaskone.`data`.model.SpinnerFieldModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FollowUpTaskOneVM : ViewModel(), KoinComponent {
  val followUpTaskOneModel: MutableLiveData<FollowUpTaskOneModel> =
      MutableLiveData(FollowUpTaskOneModel())

  var navArguments: Bundle? = null

  val spinnerFieldList: MutableLiveData<MutableList<SpinnerFieldModel>> = MutableLiveData()

  val listmohallaList: MutableLiveData<MutableList<Listmohalla1RowModel>> =
      MutableLiveData(mutableListOf())
}
