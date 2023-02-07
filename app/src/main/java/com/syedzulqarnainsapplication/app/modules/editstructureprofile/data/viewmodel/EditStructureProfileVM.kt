package com.syedzulqarnainsapplication.app.modules.editstructureprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.editstructureprofile.`data`.model.EditStructureProfileModel
import org.koin.core.KoinComponent

class EditStructureProfileVM : ViewModel(), KoinComponent {
  val editStructureProfileModel: MutableLiveData<EditStructureProfileModel> =
      MutableLiveData(EditStructureProfileModel())

  var navArguments: Bundle? = null
}
