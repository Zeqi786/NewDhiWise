package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordone.`data`.model.EditVaccinationRecordOneModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordone.`data`.model.SpinnerFieldModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordone.`data`.model.SpinnerFieldOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditVaccinationRecordOneVM : ViewModel(), KoinComponent {
  val editVaccinationRecordOneModel: MutableLiveData<EditVaccinationRecordOneModel> =
      MutableLiveData(EditVaccinationRecordOneModel())

  var navArguments: Bundle? = null

  val spinnerFieldList: MutableLiveData<MutableList<SpinnerFieldModel>> = MutableLiveData()

  val spinnerFieldOneList: MutableLiveData<MutableList<SpinnerFieldOneModel>> = MutableLiveData()
}
