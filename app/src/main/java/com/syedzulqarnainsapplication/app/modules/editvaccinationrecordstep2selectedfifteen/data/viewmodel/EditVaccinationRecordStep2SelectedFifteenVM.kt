package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfifteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfifteen.`data`.model.EditVaccinationRecordStep2SelectedFifteenModel
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedFifteenVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedFifteenModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedFifteenModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedFifteenModel())

  var navArguments: Bundle? = null
}
