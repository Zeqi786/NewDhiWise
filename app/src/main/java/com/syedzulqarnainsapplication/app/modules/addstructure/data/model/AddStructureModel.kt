package com.syedzulqarnainsapplication.app.modules.addstructure.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AddStructureModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVaccinatorTask: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_structure)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTextValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_rehri_goth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etBlockCounterValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_block_122)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTextOneValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_white_mosque)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTextTwoValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etHeadingValue: String? = null
)
