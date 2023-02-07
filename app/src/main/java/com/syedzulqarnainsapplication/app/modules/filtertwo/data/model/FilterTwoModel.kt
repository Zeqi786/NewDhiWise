package com.syedzulqarnainsapplication.app.modules.filtertwo.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FilterTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVaccinatorTask: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtontext: String? = MyApp.getInstance().resources.getString(R.string.lbl_apply_filter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMenu1Menu2M: String? = MyApp.getInstance().resources.getString(R.string.lbl_rehri_goth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_chata_gabool)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMenu1Menu2MOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_gharibabad)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMenu1Menu2MTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_jamali_goth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMenu1Menu2MThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_khuda_bakhsh_go)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etHeadingValue: String? = null
)
