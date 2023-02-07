package com.syedzulqarnainsapplication.app.modules.followuptasktwo.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FollowUpTaskTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVaccinatorTask: String? =
      MyApp.getInstance().resources.getString(R.string.msg_standard_follow)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextaddressOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_abc_mohalla)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVRIDAG202519: String? =
      MyApp.getInstance().resources.getString(R.string.msg_standard_follow2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.msg_structure_detai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_14_nov_at_2_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_vr_chw_selected)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.msg_14_nov_at_2_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.msg_vr_chw_selected)
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
  var txtTextbartoolcOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_family_refused)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextbartoolcTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_structure_locke)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etHeadingValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etHeadingOneValue: String? = null
)
