package com.syedzulqarnainsapplication.app.modules.capturevaccinationcardtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.capturevaccinationcardtwo.`data`.model.CaptureVaccinationCardTwoModel
import org.koin.core.KoinComponent

class CaptureVaccinationCardTwoVM : ViewModel(), KoinComponent {
  val captureVaccinationCardTwoModel: MutableLiveData<CaptureVaccinationCardTwoModel> =
      MutableLiveData(CaptureVaccinationCardTwoModel())

  var navArguments: Bundle? = null
}
