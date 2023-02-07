package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedsix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedsix.`data`.model.EditVaccinationRecordStep2SelectedSixModel
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedSixVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedSixModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedSixModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedSixModel())

  var navArguments: Bundle? = null
}
