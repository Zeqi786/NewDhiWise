package com.syedzulqarnainsapplication.app.modules.capturedimagefour.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CapturedImageFourModel(
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
