package com.syedzulqarnainsapplication.app.modules.childprofileone.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChildProfileOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVaccinatorTask: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_child_profile)
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
  var txtCardheadertex: String? =
      MyApp.getInstance().resources.getString(R.string.msg_vaccination_car)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReasonforUnva: String? =
      MyApp.getInstance().resources.getString(R.string.msg_reason_for_unva)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFearoffevera: String? =
      MyApp.getInstance().resources.getString(R.string.msg_fear_of_fever_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReasonforRefu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_reason_for_refu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVaccinehesitan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_vaccine_hesitan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextOne: String? = MyApp.getInstance().resources.getString(R.string.msg_vaccination_rec)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeekCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_week)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeeksCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_6_weeks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeeksCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_weeks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeeksCounterTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_14_weeks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_9_months)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_15_months)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etHeadingValue: String? = null
)
