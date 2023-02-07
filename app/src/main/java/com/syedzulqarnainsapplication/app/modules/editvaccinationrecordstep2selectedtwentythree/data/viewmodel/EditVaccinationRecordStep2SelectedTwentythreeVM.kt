package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentythree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentythree.`data`.model.EditVaccinationRecordStep2SelectedTwentythreeModel
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedTwentythreeVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedTwentythreeModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedTwentythreeModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedTwentythreeModel())

  var navArguments: Bundle? = null
}
