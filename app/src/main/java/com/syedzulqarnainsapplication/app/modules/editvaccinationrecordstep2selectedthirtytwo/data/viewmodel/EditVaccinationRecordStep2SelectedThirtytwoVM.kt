package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtytwo.`data`.model.EditVaccinationRecordStep2SelectedThirtytwoModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtytwo.`data`.model.SpinnerFieldModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtytwo.`data`.model.SpinnerFieldOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedThirtytwoVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedThirtytwoModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedThirtytwoModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedThirtytwoModel())

  var navArguments: Bundle? = null

  val spinnerFieldList: MutableLiveData<MutableList<SpinnerFieldModel>> = MutableLiveData()

  val spinnerFieldOneList: MutableLiveData<MutableList<SpinnerFieldOneModel>> = MutableLiveData()
}
