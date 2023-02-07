package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyfour.`data`.model.EditVaccinationRecordStep2SelectedThirtyfourModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyfour.`data`.model.SpinnerFieldModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyfour.`data`.model.SpinnerFieldOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedThirtyfourVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedThirtyfourModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedThirtyfourModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedThirtyfourModel())

  var navArguments: Bundle? = null

  val spinnerFieldList: MutableLiveData<MutableList<SpinnerFieldModel>> = MutableLiveData()

  val spinnerFieldOneList: MutableLiveData<MutableList<SpinnerFieldOneModel>> = MutableLiveData()
}
