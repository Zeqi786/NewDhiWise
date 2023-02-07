package com.syedzulqarnainsapplication.app.modules.followuptasktwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.followuptasktwo.`data`.model.FollowUpTaskTwoModel
import com.syedzulqarnainsapplication.app.modules.followuptasktwo.`data`.model.ListmohallaRowModel
import com.syedzulqarnainsapplication.app.modules.followuptasktwo.`data`.model.SpinnerFieldModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FollowUpTaskTwoVM : ViewModel(), KoinComponent {
  val followUpTaskTwoModel: MutableLiveData<FollowUpTaskTwoModel> =
      MutableLiveData(FollowUpTaskTwoModel())

  var navArguments: Bundle? = null

  val spinnerFieldList: MutableLiveData<MutableList<SpinnerFieldModel>> = MutableLiveData()

  val listmohallaList: MutableLiveData<MutableList<ListmohallaRowModel>> =
      MutableLiveData(mutableListOf())
}
