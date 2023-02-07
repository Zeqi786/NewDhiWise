package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedsixteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedsixteen.`data`.model.EditVaccinationRecordStep2SelectedSixteenModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedsixteen.`data`.model.SpinnerFieldOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedSixteenVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedSixteenModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedSixteenModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedSixteenModel())

  var navArguments: Bundle? = null

  val spinnerFieldOneList: MutableLiveData<MutableList<SpinnerFieldOneModel>> = MutableLiveData()
}
