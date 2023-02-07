package com.syedzulqarnainsapplication.app.modules.childprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.childprofile.`data`.model.ChildProfileModel
import com.syedzulqarnainsapplication.app.modules.childprofile.`data`.model.Listage5RowModel
import com.syedzulqarnainsapplication.app.modules.childprofile.`data`.model.ListbcgRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ChildProfileVM : ViewModel(), KoinComponent {
  val childProfileModel: MutableLiveData<ChildProfileModel> = MutableLiveData(ChildProfileModel())

  var navArguments: Bundle? = null

  val listageList: MutableLiveData<MutableList<Listage5RowModel>> = MutableLiveData(mutableListOf())

  val listbcgList: MutableLiveData<MutableList<ListbcgRowModel>> = MutableLiveData(mutableListOf())
}
