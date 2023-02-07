package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyfour.`data`.model.EditVaccinationRecordStep2SelectedTwentyfourModel
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedTwentyfourVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedTwentyfourModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedTwentyfourModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedTwentyfourModel())

  var navArguments: Bundle? = null
}
