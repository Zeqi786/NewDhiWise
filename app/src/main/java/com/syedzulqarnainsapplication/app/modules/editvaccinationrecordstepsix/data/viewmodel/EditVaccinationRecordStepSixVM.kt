package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepsix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepsix.`data`.model.EditVaccinationRecordStepSixModel
import org.koin.core.KoinComponent

class EditVaccinationRecordStepSixVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStepSixModel: MutableLiveData<EditVaccinationRecordStepSixModel> =
      MutableLiveData(EditVaccinationRecordStepSixModel())

  var navArguments: Bundle? = null
}
