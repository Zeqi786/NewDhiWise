package com.syedzulqarnainsapplication.app.modules.childtaskfilledone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.childtaskfilledone.`data`.model.ChildTaskFilledOneModel
import com.syedzulqarnainsapplication.app.modules.childtaskfilledone.`data`.model.Listage4RowModel
import com.syedzulqarnainsapplication.app.modules.childtaskfilledone.`data`.model.Listmothername4RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ChildTaskFilledOneVM : ViewModel(), KoinComponent {
  val childTaskFilledOneModel: MutableLiveData<ChildTaskFilledOneModel> =
      MutableLiveData(ChildTaskFilledOneModel())

  var navArguments: Bundle? = null

  val listageList: MutableLiveData<MutableList<Listage4RowModel>> = MutableLiveData(mutableListOf())

  val listmothernameList: MutableLiveData<MutableList<Listmothername4RowModel>> =
      MutableLiveData(mutableListOf())
}
