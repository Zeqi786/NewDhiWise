package com.syedzulqarnainsapplication.app.modules.mobilizationtasks.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MobilizationTasksModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVaccinatorTask: String? =
      MyApp.getInstance().resources.getString(R.string.msg_vaccination_tas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVRIDAG202519: String? = MyApp.getInstance().resources.getString(R.string.lbl_rehri_goth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextaddressOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_shahzain_ali)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVRIDAG202519One: String? = MyApp.getInstance().resources.getString(R.string.lbl_rehri_goth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVRIDAG202519Two: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_vr_id_ag202519)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVRIDAG202519Three: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_zero_dose)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextaddressOneOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_mohammad_omar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVRIDAG202519Four: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_rehri_goth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVRIDAG202519Five: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_vr_id_ag202519)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVRIDAG202519Six: String? = MyApp.getInstance().resources.getString(R.string.lbl_zero_dose)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVRIDAG202519Seven: String? = MyApp.getInstance().resources.getString(R.string.lbl_overdue)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextaddressOneTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ibrahim_akram)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVRIDAG202519Eight: String? = MyApp.getInstance().resources.getString(R.string.lbl_gujro)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVRIDAG202519Nine: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_vr_id_ag202519)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVRIDAG202519Ten: String? =
      MyApp.getInstance().resources.getString(R.string.msg_partially_vacci)

)
