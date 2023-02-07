package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeighteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeighteen.`data`.model.EditVaccinationRecordStep2SelectedEighteenModel
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedEighteenVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedEighteenModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedEighteenModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedEighteenModel())

  var navArguments: Bundle? = null
}
