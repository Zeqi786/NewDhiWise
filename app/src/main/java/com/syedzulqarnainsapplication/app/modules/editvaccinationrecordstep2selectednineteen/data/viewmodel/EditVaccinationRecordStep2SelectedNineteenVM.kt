package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectednineteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectednineteen.`data`.model.EditVaccinationRecordStep2SelectedNineteenModel
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedNineteenVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedNineteenModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedNineteenModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedNineteenModel())

  var navArguments: Bundle? = null
}
