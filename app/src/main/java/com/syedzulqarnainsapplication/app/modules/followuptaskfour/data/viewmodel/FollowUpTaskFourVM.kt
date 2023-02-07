package com.syedzulqarnainsapplication.app.modules.followuptaskfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.followuptaskfour.`data`.model.FollowUpTaskFourModel
import com.syedzulqarnainsapplication.app.modules.followuptaskfour.`data`.model.Listmohalla6RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FollowUpTaskFourVM : ViewModel(), KoinComponent {
  val followUpTaskFourModel: MutableLiveData<FollowUpTaskFourModel> =
      MutableLiveData(FollowUpTaskFourModel())

  var navArguments: Bundle? = null

  val listmohallaList: MutableLiveData<MutableList<Listmohalla6RowModel>> =
      MutableLiveData(mutableListOf())
}
