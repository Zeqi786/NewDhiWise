package com.syedzulqarnainsapplication.app.modules.childtaskdefault.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.childtaskdefault.`data`.model.ChildTaskDefaultModel
import com.syedzulqarnainsapplication.app.modules.childtaskdefault.`data`.model.ListageRowModel
import com.syedzulqarnainsapplication.app.modules.childtaskdefault.`data`.model.ListmothernameRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ChildTaskDefaultVM : ViewModel(), KoinComponent {
  val childTaskDefaultModel: MutableLiveData<ChildTaskDefaultModel> =
      MutableLiveData(ChildTaskDefaultModel())

  var navArguments: Bundle? = null

  val listageList: MutableLiveData<MutableList<ListageRowModel>> = MutableLiveData(mutableListOf())

  val listmothernameList: MutableLiveData<MutableList<ListmothernameRowModel>> =
      MutableLiveData(mutableListOf())
}
