package com.syedzulqarnainsapplication.app.modules.searchwomanthree.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchWomanThreeModel(
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
  var etTextOneValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_shazia_ali)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTextTwoValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_abc_mohalla)
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
  var etHeadingValue: String? = null
)
