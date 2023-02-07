package com.syedzulqarnainsapplication.app.modules.childtaskfocused.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.childtaskfocused.`data`.model.ChildTaskFocusedModel
import com.syedzulqarnainsapplication.app.modules.childtaskfocused.`data`.model.Listage1RowModel
import com.syedzulqarnainsapplication.app.modules.childtaskfocused.`data`.model.Listmothername1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ChildTaskFocusedVM : ViewModel(), KoinComponent {
  val childTaskFocusedModel: MutableLiveData<ChildTaskFocusedModel> =
      MutableLiveData(ChildTaskFocusedModel())

  var navArguments: Bundle? = null

  val listageList: MutableLiveData<MutableList<Listage1RowModel>> = MutableLiveData(mutableListOf())

  val listmothernameList: MutableLiveData<MutableList<Listmothername1RowModel>> =
      MutableLiveData(mutableListOf())
}
