package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfour.`data`.model.EditVaccinationRecordStep2SelectedFourModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfour.`data`.model.SpinnerFieldOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedFourVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedFourModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedFourModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedFourModel())

  var navArguments: Bundle? = null

  val spinnerFieldOneList: MutableLiveData<MutableList<SpinnerFieldOneModel>> = MutableLiveData()
}
