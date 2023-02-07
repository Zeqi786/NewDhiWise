package com.syedzulqarnainsapplication.app.modules.itemmenu.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DrawerItemMenuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_follow_up_task)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_structure)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeFour: String? = MyApp.getInstance().resources.getString(R.string.msg_search_structur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_search_by_vr_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_out)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_sync)

)
