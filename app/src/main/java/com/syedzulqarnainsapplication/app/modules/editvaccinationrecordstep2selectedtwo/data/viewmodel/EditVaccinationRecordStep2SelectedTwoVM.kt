package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwo.`data`.model.EditVaccinationRecordStep2SelectedTwoModel
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedTwoVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedTwoModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedTwoModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedTwoModel())

  var navArguments: Bundle? = null
}
