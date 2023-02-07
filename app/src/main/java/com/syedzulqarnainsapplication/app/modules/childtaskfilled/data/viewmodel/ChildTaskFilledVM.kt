package com.syedzulqarnainsapplication.app.modules.childtaskfilled.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.childtaskfilled.`data`.model.ChildTaskFilledModel
import com.syedzulqarnainsapplication.app.modules.childtaskfilled.`data`.model.Listage3RowModel
import com.syedzulqarnainsapplication.app.modules.childtaskfilled.`data`.model.Listmothername3RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ChildTaskFilledVM : ViewModel(), KoinComponent {
  val childTaskFilledModel: MutableLiveData<ChildTaskFilledModel> =
      MutableLiveData(ChildTaskFilledModel())

  var navArguments: Bundle? = null

  val listageList: MutableLiveData<MutableList<Listage3RowModel>> = MutableLiveData(mutableListOf())

  val listmothernameList: MutableLiveData<MutableList<Listmothername3RowModel>> =
      MutableLiveData(mutableListOf())
}
