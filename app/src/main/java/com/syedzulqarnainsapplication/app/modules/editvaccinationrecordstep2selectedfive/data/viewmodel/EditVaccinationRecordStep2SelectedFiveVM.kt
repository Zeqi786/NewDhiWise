package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfive.`data`.model.EditVaccinationRecordStep2SelectedFiveModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfive.`data`.model.ListsRowModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfive.`data`.model.SpinnerGroup599Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedFiveVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedFiveModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedFiveModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedFiveModel())

  var navArguments: Bundle? = null

  val spinnerGroup599List: MutableLiveData<MutableList<SpinnerGroup599Model>> = MutableLiveData()

  val listsList: MutableLiveData<MutableList<ListsRowModel>> = MutableLiveData(mutableListOf())
}
