package com.syedzulqarnainsapplication.app.modules.childtaskfocused.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listmothername1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMotherName: String? = MyApp.getInstance().resources.getString(R.string.lbl_mother_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShaziaAli: String? = MyApp.getInstance().resources.getString(R.string.lbl_shazia_ali)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMotherVRID: String? = MyApp.getInstance().resources.getString(R.string.lbl_mother_vr_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAG584901: String? = MyApp.getInstance().resources.getString(R.string.lbl_ag584901)

)
