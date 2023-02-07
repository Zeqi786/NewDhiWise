package com.syedzulqarnainsapplication.app.modules.searchchildone.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchChildOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTextaddressOne: String? =
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
  var etTextOneValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_shahzain_ali)
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
  var etHeadingValue: String? = null
)
