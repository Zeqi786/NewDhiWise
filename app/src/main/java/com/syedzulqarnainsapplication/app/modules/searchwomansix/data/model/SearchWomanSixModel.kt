package com.syedzulqarnainsapplication.app.modules.searchwomansix.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchWomanSixModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTextaddressOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_shazia_ali)
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
  var txtVRIDAG202519One: String? = MyApp.getInstance().resources.getString(R.string.lbl_pregnant)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVRIDAG202519Two: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_edd_7_6_2020)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etZipcodeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etHeadingValue: String? = null
)
