package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentynine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentynine.`data`.model.EditVaccinationRecordStep2SelectedTwentynineModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentynine.`data`.model.SpinnerFieldModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentynine.`data`.model.SpinnerFieldOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedTwentynineVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedTwentynineModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedTwentynineModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedTwentynineModel())

  var navArguments: Bundle? = null

  val spinnerFieldList: MutableLiveData<MutableList<SpinnerFieldModel>> = MutableLiveData()

  val spinnerFieldOneList: MutableLiveData<MutableList<SpinnerFieldOneModel>> = MutableLiveData()
}
