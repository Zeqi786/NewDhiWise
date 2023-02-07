package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtythree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtythree.`data`.model.EditVaccinationRecordStep2SelectedThirtythreeModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtythree.`data`.model.SpinnerFieldModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtythree.`data`.model.SpinnerFieldOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedThirtythreeVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedThirtythreeModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedThirtythreeModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedThirtythreeModel())

  var navArguments: Bundle? = null

  val spinnerFieldList: MutableLiveData<MutableList<SpinnerFieldModel>> = MutableLiveData()

  val spinnerFieldOneList: MutableLiveData<MutableList<SpinnerFieldOneModel>> = MutableLiveData()
}
