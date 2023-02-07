package com.syedzulqarnainsapplication.app.modules.structureprofiletwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.structureprofiletwo.`data`.model.Listmohalla7RowModel
import com.syedzulqarnainsapplication.app.modules.structureprofiletwo.`data`.model.StructureProfileTwoModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class StructureProfileTwoVM : ViewModel(), KoinComponent {
  val structureProfileTwoModel: MutableLiveData<StructureProfileTwoModel> =
      MutableLiveData(StructureProfileTwoModel())

  var navArguments: Bundle? = null

  val listmohallaList: MutableLiveData<MutableList<Listmohalla7RowModel>> =
      MutableLiveData(mutableListOf())
}
