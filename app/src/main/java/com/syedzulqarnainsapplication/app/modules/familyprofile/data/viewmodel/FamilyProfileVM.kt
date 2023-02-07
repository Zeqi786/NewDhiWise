package com.syedzulqarnainsapplication.app.modules.familyprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.familyprofile.`data`.model.FamilyProfileModel
import org.koin.core.KoinComponent

class FamilyProfileVM : ViewModel(), KoinComponent {
  val familyProfileModel: MutableLiveData<FamilyProfileModel> =
      MutableLiveData(FamilyProfileModel())

  var navArguments: Bundle? = null
}
