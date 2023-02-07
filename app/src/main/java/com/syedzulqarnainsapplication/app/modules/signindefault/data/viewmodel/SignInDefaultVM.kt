package com.syedzulqarnainsapplication.app.modules.signindefault.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.syedzulqarnainsapplication.app.modules.signindefault.`data`.model.SignInDefaultModel
import org.koin.core.KoinComponent

class SignInDefaultVM : ViewModel(), KoinComponent {
  val signInDefaultModel: MutableLiveData<SignInDefaultModel> =
      MutableLiveData(SignInDefaultModel())

  var navArguments: Bundle? = null
}
