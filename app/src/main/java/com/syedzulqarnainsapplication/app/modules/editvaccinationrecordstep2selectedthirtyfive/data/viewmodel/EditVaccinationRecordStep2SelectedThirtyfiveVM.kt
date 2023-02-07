package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyfive.`data`.model.EditVaccinationRecordStep2SelectedThirtyfiveModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyfive.`data`.model.Lists4RowModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyfive.`data`.model.SpinnerGroup699Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedThirtyfiveVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedThirtyfiveModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedThirtyfiveModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedThirtyfiveModel())

  var navArguments: Bundle? = null

  val spinnerGroup699List: MutableLiveData<MutableList<SpinnerGroup699Model>> = MutableLiveData()

  val listsList: MutableLiveData<MutableList<Lists4RowModel>> = MutableLiveData(mutableListOf())
}
