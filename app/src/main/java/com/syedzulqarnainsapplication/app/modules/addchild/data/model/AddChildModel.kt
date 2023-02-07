package com.syedzulqarnainsapplication.app.modules.addchild.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AddChildModel(
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
  var txtLabelTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_gender)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTextTwoValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_shahzain_ali)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etDateValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_01_04_2019)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTextThreeValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_123)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldValue: String? = null
)
