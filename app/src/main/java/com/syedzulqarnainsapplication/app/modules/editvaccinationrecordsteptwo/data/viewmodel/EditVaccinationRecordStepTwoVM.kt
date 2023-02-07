package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordsteptwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordsteptwo.`data`.model.EditVaccinationRecordStepTwoModel
import org.koin.core.KoinComponent

class EditVaccinationRecordStepTwoVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStepTwoModel: MutableLiveData<EditVaccinationRecordStepTwoModel> =
      MutableLiveData(EditVaccinationRecordStepTwoModel())

  var navArguments: Bundle? = null
}
