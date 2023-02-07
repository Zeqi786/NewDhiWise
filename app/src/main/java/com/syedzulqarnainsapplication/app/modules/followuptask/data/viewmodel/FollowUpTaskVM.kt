package com.syedzulqarnainsapplication.app.modules.followuptask.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.followuptask.`data`.model.FollowUpTaskModel
import com.syedzulqarnainsapplication.app.modules.followuptask.`data`.model.FollowUpTaskRowModel
import com.syedzulqarnainsapplication.app.modules.followuptask.`data`.model.SpinnerFieldModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FollowUpTaskVM : ViewModel(), KoinComponent {
  val followUpTaskModel: MutableLiveData<FollowUpTaskModel> = MutableLiveData(FollowUpTaskModel())

  var navArguments: Bundle? = null

  val spinnerFieldList: MutableLiveData<MutableList<SpinnerFieldModel>> = MutableLiveData()

  val followupTaskList: MutableLiveData<MutableList<FollowUpTaskRowModel>> =
      MutableLiveData(mutableListOf())
}
