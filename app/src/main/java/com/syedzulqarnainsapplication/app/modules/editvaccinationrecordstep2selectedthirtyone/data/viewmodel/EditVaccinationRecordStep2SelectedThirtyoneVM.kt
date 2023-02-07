package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyone.`data`.model.EditVaccinationRecordStep2SelectedThirtyoneModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyone.`data`.model.Lists5RowModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyone.`data`.model.SpinnerGroup681Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedThirtyoneVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedThirtyoneModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedThirtyoneModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedThirtyoneModel())

  var navArguments: Bundle? = null

  val spinnerGroup681List: MutableLiveData<MutableList<SpinnerGroup681Model>> = MutableLiveData()

  val listsList: MutableLiveData<MutableList<Lists5RowModel>> = MutableLiveData(mutableListOf())
}
