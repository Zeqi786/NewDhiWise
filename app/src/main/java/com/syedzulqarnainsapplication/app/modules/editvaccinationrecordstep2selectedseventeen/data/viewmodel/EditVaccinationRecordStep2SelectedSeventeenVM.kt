package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedseventeen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedseventeen.`data`.model.EditVaccinationRecordStep2SelectedSeventeenModel
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedSeventeenVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedSeventeenModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedSeventeenModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedSeventeenModel())

  var navArguments: Bundle? = null
}
