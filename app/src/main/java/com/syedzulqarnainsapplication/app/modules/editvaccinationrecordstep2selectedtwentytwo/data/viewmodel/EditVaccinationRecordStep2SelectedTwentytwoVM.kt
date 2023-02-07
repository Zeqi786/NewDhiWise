package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentytwo.`data`.model.EditVaccinationRecordStep2SelectedTwentytwoModel
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedTwentytwoVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedTwentytwoModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedTwentytwoModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedTwentytwoModel())

  var navArguments: Bundle? = null
}
