package com.syedzulqarnainsapplication.app.modules.childprofileone.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listbcg1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBCG: String? = MyApp.getInstance().resources.getString(R.string.lbl_bcg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3819: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_8_19)

)
