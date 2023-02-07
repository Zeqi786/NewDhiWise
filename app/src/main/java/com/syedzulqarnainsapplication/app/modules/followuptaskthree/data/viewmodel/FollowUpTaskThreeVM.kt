package com.syedzulqarnainsapplication.app.modules.followuptaskthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.followuptaskthree.`data`.model.FollowUpTaskThreeModel
import com.syedzulqarnainsapplication.app.modules.followuptaskthree.`data`.model.Listmohalla4RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FollowUpTaskThreeVM : ViewModel(), KoinComponent {
  val followUpTaskThreeModel: MutableLiveData<FollowUpTaskThreeModel> =
      MutableLiveData(FollowUpTaskThreeModel())

  var navArguments: Bundle? = null

  val listmohallaList: MutableLiveData<MutableList<Listmohalla4RowModel>> =
      MutableLiveData(mutableListOf())
}
