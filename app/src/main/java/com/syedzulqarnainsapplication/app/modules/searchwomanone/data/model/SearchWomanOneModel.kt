package com.syedzulqarnainsapplication.app.modules.searchwomanone.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchWomanOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNoProfileFoun: String? =
      MyApp.getInstance().resources.getString(R.string.msg_no_profile_foun)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoprofilematc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_no_profile_matc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etZipcodeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etHeadingValue: String? = null
)
