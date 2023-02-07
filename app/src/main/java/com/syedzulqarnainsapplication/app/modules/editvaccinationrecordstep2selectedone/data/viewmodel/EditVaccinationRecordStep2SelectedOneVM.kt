package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedone.`data`.model.EditVaccinationRecordStep2SelectedOneModel
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedOneVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedOneModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedOneModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedOneModel())

  var navArguments: Bundle? = null
}
