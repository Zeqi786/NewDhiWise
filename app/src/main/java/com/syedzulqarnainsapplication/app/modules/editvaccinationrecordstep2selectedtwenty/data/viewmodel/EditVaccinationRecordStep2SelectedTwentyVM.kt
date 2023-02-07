package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwenty.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwenty.`data`.model.EditVaccinationRecordStep2SelectedTwentyModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwenty.`data`.model.SpinnerFieldOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedTwentyVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedTwentyModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedTwentyModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedTwentyModel())

  var navArguments: Bundle? = null

  val spinnerFieldOneList: MutableLiveData<MutableList<SpinnerFieldOneModel>> = MutableLiveData()
}
