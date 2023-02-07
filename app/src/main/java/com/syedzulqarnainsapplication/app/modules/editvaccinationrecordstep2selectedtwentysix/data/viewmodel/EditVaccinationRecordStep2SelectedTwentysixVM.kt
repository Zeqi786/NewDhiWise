package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentysix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentysix.`data`.model.EditVaccinationRecordStep2SelectedTwentysixModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentysix.`data`.model.Lists2RowModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentysix.`data`.model.SpinnerGroup675Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedTwentysixVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedTwentysixModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedTwentysixModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedTwentysixModel())

  var navArguments: Bundle? = null

  val spinnerGroup675List: MutableLiveData<MutableList<SpinnerGroup675Model>> = MutableLiveData()

  val listsList: MutableLiveData<MutableList<Lists2RowModel>> = MutableLiveData(mutableListOf())
}
