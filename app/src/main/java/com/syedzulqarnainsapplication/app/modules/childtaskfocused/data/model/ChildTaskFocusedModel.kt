package com.syedzulqarnainsapplication.app.modules.childtaskfocused.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChildTaskFocusedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVaccinatorTask: String? =
      MyApp.getInstance().resources.getString(R.string.msg_child_vaccinati)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextaddressOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_shahzain_ali)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVridCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_vr_id_89389304)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVRIDAG202519: String? = MyApp.getInstance().resources.getString(R.string.lbl_zero_dose)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl_child_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextOne: String? = MyApp.getInstance().resources.getString(R.string.msg_demographic_det)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtontext: String? = MyApp.getInstance().resources.getString(R.string.lbl_complete_action)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextbartoolc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_conduct_follow)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextbartoolcOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_deceased)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextbartoolcTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_shift_out)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etHeadingValue: String? = null
)
