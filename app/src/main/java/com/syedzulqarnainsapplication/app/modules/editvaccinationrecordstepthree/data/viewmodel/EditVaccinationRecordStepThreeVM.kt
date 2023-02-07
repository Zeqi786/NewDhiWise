package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepthree.`data`.model.EditVaccinationRecordStepThreeModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepthree.`data`.model.SpinnerFieldModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepthree.`data`.model.SpinnerFieldOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditVaccinationRecordStepThreeVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStepThreeModel: MutableLiveData<EditVaccinationRecordStepThreeModel> =
      MutableLiveData(EditVaccinationRecordStepThreeModel())

  var navArguments: Bundle? = null

  val spinnerFieldList: MutableLiveData<MutableList<SpinnerFieldModel>> = MutableLiveData()

  val spinnerFieldOneList: MutableLiveData<MutableList<SpinnerFieldOneModel>> = MutableLiveData()
}
