package com.syedzulqarnainsapplication.app.modules.signindefault.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignInDefaultModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSignIn: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldOneValue: String? = null
)
