package com.syedzulqarnainsapplication.app.modules.childtaskfilledtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.childtaskfilledtwo.`data`.model.ChildTaskFilledTwoModel
import com.syedzulqarnainsapplication.app.modules.childtaskfilledtwo.`data`.model.Listage2RowModel
import com.syedzulqarnainsapplication.app.modules.childtaskfilledtwo.`data`.model.Listmothername2RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ChildTaskFilledTwoVM : ViewModel(), KoinComponent {
  val childTaskFilledTwoModel: MutableLiveData<ChildTaskFilledTwoModel> =
      MutableLiveData(ChildTaskFilledTwoModel())

  var navArguments: Bundle? = null

  val listageList: MutableLiveData<MutableList<Listage2RowModel>> = MutableLiveData(mutableListOf())

  val listmothernameList: MutableLiveData<MutableList<Listmothername2RowModel>> =
      MutableLiveData(mutableListOf())
}
