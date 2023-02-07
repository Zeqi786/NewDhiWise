package com.syedzulqarnainsapplication.app.modules.filter.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FilterModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVaccinatorTask: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etHeadingValue: String? = null
)
