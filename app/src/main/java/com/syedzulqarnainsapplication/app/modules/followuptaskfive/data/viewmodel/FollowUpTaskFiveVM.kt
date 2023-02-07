package com.syedzulqarnainsapplication.app.modules.followuptaskfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.followuptaskfive.`data`.model.FollowUpTaskFiveModel
import com.syedzulqarnainsapplication.app.modules.followuptaskfive.`data`.model.Listmohalla5RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FollowUpTaskFiveVM : ViewModel(), KoinComponent {
  val followUpTaskFiveModel: MutableLiveData<FollowUpTaskFiveModel> =
      MutableLiveData(FollowUpTaskFiveModel())

  var navArguments: Bundle? = null

  val listmohallaList: MutableLiveData<MutableList<Listmohalla5RowModel>> =
      MutableLiveData(mutableListOf())
}
