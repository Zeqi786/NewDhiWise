package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyfive.`data`.model.EditVaccinationRecordStep2SelectedTwentyfiveModel
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedTwentyfiveVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedTwentyfiveModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedTwentyfiveModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedTwentyfiveModel())

  var navArguments: Bundle? = null
}
