package com.syedzulqarnainsapplication.app.modules.addwomantwo.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AddWomanTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVaccinatorTask: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_woman2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.msg_demographic_inf)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_step_1_of_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBlockinformati: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_date_of_birth2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_marital_status)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_ethnicity)
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
  var etFieldTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldFourValue: String? = null
)
