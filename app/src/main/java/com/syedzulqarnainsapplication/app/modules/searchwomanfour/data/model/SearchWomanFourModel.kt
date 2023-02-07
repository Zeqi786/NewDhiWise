package com.syedzulqarnainsapplication.app.modules.searchwomanfour.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchWomanFourModel(
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
  var etFieldThreeValue: String? = null
)
