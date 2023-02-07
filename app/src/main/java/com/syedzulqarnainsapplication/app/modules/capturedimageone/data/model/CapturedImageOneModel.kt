package com.syedzulqarnainsapplication.app.modules.capturedimageone.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CapturedImageOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtButtontext: String? = MyApp.getInstance().resources.getString(R.string.lbl_submit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.msg_the_image_for_v)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextleft: String? = MyApp.getInstance().resources.getString(R.string.lbl_okay)

)
