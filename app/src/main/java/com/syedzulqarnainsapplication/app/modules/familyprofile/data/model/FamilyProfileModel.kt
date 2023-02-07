package com.syedzulqarnainsapplication.app.modules.familyprofile.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FamilyProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVaccinatorTask: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_family_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextaddressOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_shazia_ali)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVridCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_vr_id_89389304)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_age_23_years)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChildCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_child)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCurrentAddress: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_current_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStructure14B: String? =
      MyApp.getInstance().resources.getString(R.string.msg_structure_14_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextaddressOneOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_shahzain_ali)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVRIDAG202519: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_vr_id_ag202519)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVRIDAG202519One: String? = MyApp.getInstance().resources.getString(R.string.lbl_zero_dose)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etHeadingValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etHeadingOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame110Value: String? = null
)
