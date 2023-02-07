package com.syedzulqarnainsapplication.app.modules.capturevaccinationcardone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.capturevaccinationcardone.`data`.model.CaptureVaccinationCardOneModel
import org.koin.core.KoinComponent

class CaptureVaccinationCardOneVM : ViewModel(), KoinComponent {
  val captureVaccinationCardOneModel: MutableLiveData<CaptureVaccinationCardOneModel> =
      MutableLiveData(CaptureVaccinationCardOneModel())

  var navArguments: Bundle? = null
}
