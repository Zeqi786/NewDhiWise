package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectednine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectednine.`data`.model.EditVaccinationRecordStep2SelectedNineModel
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedNineVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedNineModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedNineModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedNineModel())

  var navArguments: Bundle? = null
}
