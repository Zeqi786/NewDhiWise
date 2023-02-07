package com.syedzulqarnainsapplication.app.modules.addstructureone.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AddStructureOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNoProfileFoun: String? =
      MyApp.getInstance().resources.getString(R.string.msg_structure_10_ad)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoprofilematc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_in_block_12_re)

)
