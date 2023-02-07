package com.syedzulqarnainsapplication.app.modules.signinfocused.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignInFocusedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSignIn: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etBlockinformatiValue: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_vaccinator)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldValue: String? = null
)
