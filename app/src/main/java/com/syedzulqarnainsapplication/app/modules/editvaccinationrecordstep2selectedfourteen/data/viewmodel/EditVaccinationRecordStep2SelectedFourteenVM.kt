package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfourteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfourteen.`data`.model.EditVaccinationRecordStep2SelectedFourteenModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedfourteen.`data`.model.SpinnerFieldOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedFourteenVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedFourteenModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedFourteenModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedFourteenModel())

  var navArguments: Bundle? = null

  val spinnerFieldOneList: MutableLiveData<MutableList<SpinnerFieldOneModel>> = MutableLiveData()
}
