package com.syedzulqarnainsapplication.app.modules.signinfocusedone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.signinfocusedone.`data`.model.SignInFocusedOneModel
import org.koin.core.KoinComponent

class SignInFocusedOneVM : ViewModel(), KoinComponent {
  val signInFocusedOneModel: MutableLiveData<SignInFocusedOneModel> =
      MutableLiveData(SignInFocusedOneModel())

  var navArguments: Bundle? = null
}
