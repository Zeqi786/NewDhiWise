package com.syedzulqarnainsapplication.app.modules.capturevaccinationcard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.capturevaccinationcard.`data`.model.CaptureVaccinationCardModel
import org.koin.core.KoinComponent

class CaptureVaccinationCardVM : ViewModel(), KoinComponent {
  val captureVaccinationCardModel: MutableLiveData<CaptureVaccinationCardModel> =
      MutableLiveData(CaptureVaccinationCardModel())

  var navArguments: Bundle? = null
}
