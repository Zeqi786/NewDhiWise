package com.syedzulqarnainsapplication.app.modules.followuptaskone.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listmohalla1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMohalla: String? = MyApp.getInstance().resources.getString(R.string.lbl_mohalla)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRehriGoth: String? = MyApp.getInstance().resources.getString(R.string.lbl_rehri_goth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBlockTwelve: String? = MyApp.getInstance().resources.getString(R.string.lbl_block_12)

)
