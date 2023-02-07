package com.syedzulqarnainsapplication.app.modules.addstructuretwo.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AddStructureTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVaccinatorTask: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_structure)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etHeadingValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldThreeValue: String? = null
)
