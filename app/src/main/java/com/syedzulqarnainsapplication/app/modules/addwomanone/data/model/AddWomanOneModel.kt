package com.syedzulqarnainsapplication.app.modules.addwomanone.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AddWomanOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVaccinatorTask: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_woman2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl_children)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_step_2_of_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabel: String? = MyApp.getInstance().resources.getString(R.string.msg_number_of_alive2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_shahzain_ali)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGender: String? = MyApp.getInstance().resources.getString(R.string.lbl_male)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_years)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextbtn: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)

)
