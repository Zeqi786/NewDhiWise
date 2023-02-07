package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepfour.`data`.model.EditVaccinationRecordStepFourModel
import org.koin.core.KoinComponent

class EditVaccinationRecordStepFourVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStepFourModel: MutableLiveData<EditVaccinationRecordStepFourModel> =
      MutableLiveData(EditVaccinationRecordStepFourModel())

  var navArguments: Bundle? = null
}
