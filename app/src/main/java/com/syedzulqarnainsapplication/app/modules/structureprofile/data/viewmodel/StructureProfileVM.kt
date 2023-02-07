package com.syedzulqarnainsapplication.app.modules.structureprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.structureprofile.`data`.model.Listmohalla3RowModel
import com.syedzulqarnainsapplication.app.modules.structureprofile.`data`.model.StructureProfileModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class StructureProfileVM : ViewModel(), KoinComponent {
  val structureProfileModel: MutableLiveData<StructureProfileModel> =
      MutableLiveData(StructureProfileModel())

  var navArguments: Bundle? = null

  val listmohallaList: MutableLiveData<MutableList<Listmohalla3RowModel>> =
      MutableLiveData(mutableListOf())
}
