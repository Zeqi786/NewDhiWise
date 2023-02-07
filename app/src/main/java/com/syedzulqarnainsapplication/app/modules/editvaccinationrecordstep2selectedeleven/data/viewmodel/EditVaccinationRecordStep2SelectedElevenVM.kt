package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeleven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeleven.`data`.model.EditVaccinationRecordStep2SelectedElevenModel
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedElevenVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedElevenModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedElevenModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedElevenModel())

  var navArguments: Bundle? = null
}
