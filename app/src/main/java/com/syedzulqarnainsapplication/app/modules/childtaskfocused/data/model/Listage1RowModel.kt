package com.syedzulqarnainsapplication.app.modules.childtaskfocused.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listage1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAge: String? = MyApp.getInstance().resources.getString(R.string.lbl_age)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_years)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGender: String? = MyApp.getInstance().resources.getString(R.string.lbl_gender)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGenderOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_female)

)
