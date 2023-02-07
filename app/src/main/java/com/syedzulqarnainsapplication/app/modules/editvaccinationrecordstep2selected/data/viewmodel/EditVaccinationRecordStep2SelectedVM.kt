package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selected.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selected.`data`.model.EditVaccinationRecordStep2SelectedModel
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedModel())

  var navArguments: Bundle? = null
}
