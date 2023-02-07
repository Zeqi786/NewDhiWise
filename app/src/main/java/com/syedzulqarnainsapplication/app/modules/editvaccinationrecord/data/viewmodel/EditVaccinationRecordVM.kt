package com.syedzulqarnainsapplication.app.modules.editvaccinationrecord.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecord.`data`.model.EditVaccinationRecordModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecord.`data`.model.SpinnerFieldModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecord.`data`.model.SpinnerFieldOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditVaccinationRecordVM : ViewModel(), KoinComponent {
  val editVaccinationRecordModel: MutableLiveData<EditVaccinationRecordModel> =
      MutableLiveData(EditVaccinationRecordModel())

  var navArguments: Bundle? = null

  val spinnerFieldList: MutableLiveData<MutableList<SpinnerFieldModel>> = MutableLiveData()

  val spinnerFieldOneList: MutableLiveData<MutableList<SpinnerFieldOneModel>> = MutableLiveData()
}
