package com.syedzulqarnainsapplication.app.modules.structureprofileone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.structureprofileone.`data`.model.Listmohalla2RowModel
import com.syedzulqarnainsapplication.app.modules.structureprofileone.`data`.model.StructureProfileOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class StructureProfileOneVM : ViewModel(), KoinComponent {
  val structureProfileOneModel: MutableLiveData<StructureProfileOneModel> =
      MutableLiveData(StructureProfileOneModel())

  var navArguments: Bundle? = null

  val listmohallaList: MutableLiveData<MutableList<Listmohalla2RowModel>> =
      MutableLiveData(mutableListOf())
}
