package com.syedzulqarnainsapplication.app.modules.capturevaccinationcardfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.capturevaccinationcardfour.`data`.model.CaptureVaccinationCardFourModel
import org.koin.core.KoinComponent

class CaptureVaccinationCardFourVM : ViewModel(), KoinComponent {
  val captureVaccinationCardFourModel: MutableLiveData<CaptureVaccinationCardFourModel> =
      MutableLiveData(CaptureVaccinationCardFourModel())

  var navArguments: Bundle? = null
}
