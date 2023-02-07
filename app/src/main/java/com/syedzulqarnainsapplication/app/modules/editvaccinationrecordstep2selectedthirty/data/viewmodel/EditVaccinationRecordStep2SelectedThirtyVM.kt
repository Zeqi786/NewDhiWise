package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirty.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirty.`data`.model.EditVaccinationRecordStep2SelectedThirtyModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirty.`data`.model.SpinnerFieldModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirty.`data`.model.SpinnerFieldOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedThirtyVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedThirtyModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedThirtyModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedThirtyModel())

  var navArguments: Bundle? = null

  val spinnerFieldList: MutableLiveData<MutableList<SpinnerFieldModel>> = MutableLiveData()

  val spinnerFieldOneList: MutableLiveData<MutableList<SpinnerFieldOneModel>> = MutableLiveData()
}
