package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthree.`data`.model.EditVaccinationRecordStep2SelectedThreeModel
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedThreeVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedThreeModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedThreeModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedThreeModel())

  var navArguments: Bundle? = null
}
