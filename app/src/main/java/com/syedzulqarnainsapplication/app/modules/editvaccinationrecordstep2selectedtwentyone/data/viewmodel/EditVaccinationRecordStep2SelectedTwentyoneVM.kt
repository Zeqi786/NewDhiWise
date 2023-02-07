package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyone.`data`.model.EditVaccinationRecordStep2SelectedTwentyoneModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyone.`data`.model.Lists3RowModel
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyone.`data`.model.SpinnerGroup655Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EditVaccinationRecordStep2SelectedTwentyoneVM : ViewModel(), KoinComponent {
  val editVaccinationRecordStep2SelectedTwentyoneModel:
      MutableLiveData<EditVaccinationRecordStep2SelectedTwentyoneModel> =
      MutableLiveData(EditVaccinationRecordStep2SelectedTwentyoneModel())

  var navArguments: Bundle? = null

  val spinnerGroup655List: MutableLiveData<MutableList<SpinnerGroup655Model>> = MutableLiveData()

  val listsList: MutableLiveData<MutableList<Lists3RowModel>> = MutableLiveData(mutableListOf())
}
