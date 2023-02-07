package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepone.`data`.model.EditVaccinationRecordStepOneModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepone.`data`.model.SpinnerFieldModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepone.`data`.model.SpinnerFieldOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditVaccinationRecordStepOneVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStepOneModel: MutableLiveData<EditVaccinationRecordStepOneModel> =
      MutableLiveData(EditVaccinationRecordStepOneModel())

  var navArguments: Bundle? = null

  val spinnerFieldList: MutableLiveData<MutableList<SpinnerFieldModel>> = MutableLiveData()

  val spinnerFieldOneList: MutableLiveData<MutableList<SpinnerFieldOneModel>> = MutableLiveData()
}
