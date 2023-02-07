package com.syedzulqarnainsapplication.app.modules.addchildone.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AddChildOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVaccinatorTask: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_child)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl_chid_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_step_1_of_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_date_of_birth2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_gender)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldTwoValue: String? = null
)
