package com.syedzulqarnainsapplication.app.modules.searchchildsix.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchChildSixModel(
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
  var etFieldOneValue: String? = null
)
