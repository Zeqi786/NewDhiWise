package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyseven.`data`.model.EditVaccinationRecordStep2SelectedTwentysevenModel
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedTwentysevenVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedTwentysevenModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedTwentysevenModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedTwentysevenModel())

  var navArguments: Bundle? = null
}
