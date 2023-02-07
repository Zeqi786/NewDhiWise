package com.syedzulqarnainsapplication.app.modules.signinfocused.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.signinfocused.`data`.model.SignInFocusedModel
import org.koin.core.KoinComponent

class SignInFocusedVM : ViewModel(), KoinComponent {
  val signInFocusedModel: MutableLiveData<SignInFocusedModel> =
      MutableLiveData(SignInFocusedModel())

  var navArguments: Bundle? = null
}
