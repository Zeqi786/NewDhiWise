package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedseven.`data`.model.EditVaccinationRecordStep2SelectedSevenModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedseven.`data`.model.Lists1RowModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedseven.`data`.model.SpinnerGroup603Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedSevenVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedSevenModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedSevenModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedSevenModel())

  var navArguments: Bundle? = null

  val spinnerGroup603List: MutableLiveData<MutableList<SpinnerGroup603Model>> = MutableLiveData()

  val listsList: MutableLiveData<MutableList<Lists1RowModel>> = MutableLiveData(mutableListOf())
}
