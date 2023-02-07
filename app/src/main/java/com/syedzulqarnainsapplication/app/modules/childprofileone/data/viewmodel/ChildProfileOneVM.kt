package com.syedzulqarnainsapplication.app.modules.childprofileone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.childprofileone.`data`.model.ChildProfileOneModel
import com.syedzulqarnainsapplication.app.modules.childprofileone.`data`.model.Listage6RowModel
import com.syedzulqarnainsapplication.app.modules.childprofileone.`data`.model.Listbcg1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ChildProfileOneVM : ViewModel(), KoinComponent {
  val childProfileOneModel: MutableLiveData<ChildProfileOneModel> =
      MutableLiveData(ChildProfileOneModel())

  var navArguments: Bundle? = null

  val listageList: MutableLiveData<MutableList<Listage6RowModel>> = MutableLiveData(mutableListOf())

  val listbcgList: MutableLiveData<MutableList<Listbcg1RowModel>> = MutableLiveData(mutableListOf())
}
