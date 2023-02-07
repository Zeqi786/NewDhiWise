package com.syedzulqarnainsapplication.app.modules.capturevaccinationcardthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.capturevaccinationcardthree.`data`.model.CaptureVaccinationCardThreeModel
import org.koin.core.KoinComponent

class CaptureVaccinationCardThreeVM : ViewModel(), KoinComponent {
  val captureVaccinationCardThreeModel: MutableLiveData<CaptureVaccinationCardThreeModel> =
      MutableLiveData(CaptureVaccinationCardThreeModel())

  var navArguments: Bundle? = null
}
