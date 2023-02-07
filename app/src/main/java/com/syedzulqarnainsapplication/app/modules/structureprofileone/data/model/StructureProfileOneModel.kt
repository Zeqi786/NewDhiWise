package com.syedzulqarnainsapplication.app.modules.structureprofileone.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class StructureProfileOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVaccinatorTask: String? =
      MyApp.getInstance().resources.getString(R.string.msg_structure_profi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextaddressOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_abc_mohalla)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStructureCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_structure_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBlockCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_block_122)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.msg_structure_detai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGPSLocation: String? = MyApp.getInstance().resources.getString(R.string.lbl_gps_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextaddressTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_on_map)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextaddressOneOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_shazia_ali)
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
  var etHeadingValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame110Value: String? = null
)
