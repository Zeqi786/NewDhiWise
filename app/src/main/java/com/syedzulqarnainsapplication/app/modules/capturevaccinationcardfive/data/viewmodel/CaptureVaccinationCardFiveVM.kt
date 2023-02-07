package com.syedzulqarnainsapplication.app.modules.capturevaccinationcardfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.capturevaccinationcardfive.`data`.model.CaptureVaccinationCardFiveModel
import org.koin.core.KoinComponent

class CaptureVaccinationCardFiveVM : ViewModel(), KoinComponent {
  val captureVaccinationCardFiveModel: MutableLiveData<CaptureVaccinationCardFiveModel> =
      MutableLiveData(CaptureVaccinationCardFiveModel())

  var navArguments: Bundle? = null
}
