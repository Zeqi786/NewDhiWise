package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedten.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedten.`data`.model.EditVaccinationRecordStep2SelectedTenModel
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedTenVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedTenModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedTenModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedTenModel())

  var navArguments: Bundle? = null
}
