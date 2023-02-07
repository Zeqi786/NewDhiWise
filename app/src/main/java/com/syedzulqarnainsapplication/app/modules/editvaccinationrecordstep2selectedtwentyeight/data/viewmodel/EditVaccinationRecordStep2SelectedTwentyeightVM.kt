package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyeight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyeight.`data`.model.EditVaccinationRecordStep2SelectedTwentyeightModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyeight.`data`.model.SpinnerFieldOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedTwentyeightVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedTwentyeightModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedTwentyeightModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedTwentyeightModel())

  var navArguments: Bundle? = null

  val spinnerFieldOneList: MutableLiveData<MutableList<SpinnerFieldOneModel>> = MutableLiveData()
}
