package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwelve.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwelve.`data`.model.EditVaccinationRecordStep2SelectedTwelveModel
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedTwelveVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedTwelveModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedTwelveModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedTwelveModel())

  var navArguments: Bundle? = null
}
