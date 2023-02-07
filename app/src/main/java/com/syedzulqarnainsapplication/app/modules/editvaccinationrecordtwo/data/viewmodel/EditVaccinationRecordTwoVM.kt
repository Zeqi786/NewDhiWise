package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordtwo.`data`.model.EditVaccinationRecordTwoModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordtwo.`data`.model.SpinnerFieldModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordtwo.`data`.model.SpinnerFieldOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditVaccinationRecordTwoVM : ViewModel(), KoinComponent {
  val editVaccinationRecordTwoModel: MutableLiveData<EditVaccinationRecordTwoModel> =
      MutableLiveData(EditVaccinationRecordTwoModel())

  var navArguments: Bundle? = null

  val spinnerFieldList: MutableLiveData<MutableList<SpinnerFieldModel>> = MutableLiveData()

  val spinnerFieldOneList: MutableLiveData<MutableList<SpinnerFieldOneModel>> = MutableLiveData()
}
