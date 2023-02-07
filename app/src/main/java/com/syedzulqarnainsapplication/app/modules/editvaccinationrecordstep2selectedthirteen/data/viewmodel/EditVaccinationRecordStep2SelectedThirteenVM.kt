package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirteen.`data`.model.EditVaccinationRecordStep2SelectedThirteenModel
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedThirteenVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedThirteenModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedThirteenModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedThirteenModel())

  var navArguments: Bundle? = null
}
