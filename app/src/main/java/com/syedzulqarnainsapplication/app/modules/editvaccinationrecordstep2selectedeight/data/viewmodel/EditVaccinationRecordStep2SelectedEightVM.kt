package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeight.`data`.model.EditVaccinationRecordStep2SelectedEightModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedeight.`data`.model.SpinnerFieldOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedEightVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedEightModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedEightModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedEightModel())

  var navArguments: Bundle? = null

  val spinnerFieldOneList: MutableLiveData<MutableList<SpinnerFieldOneModel>> = MutableLiveData()
}
