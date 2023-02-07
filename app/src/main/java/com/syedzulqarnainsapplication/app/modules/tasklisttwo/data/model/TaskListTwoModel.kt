package com.syedzulqarnainsapplication.app.modules.tasklisttwo.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TaskListTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVaccinatorTask: String? =
      MyApp.getInstance().resources.getString(R.string.msg_standard_follow3)
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
  var txtVRIDAG202519: String? =
      MyApp.getInstance().resources.getString(R.string.msg_block_5_abc_mo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStructureCounterOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_structure_11)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVRIDAG202519One: String? =
      MyApp.getInstance().resources.getString(R.string.msg_block_5_abc_mo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStructureCounterTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_structure_12)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVRIDAG202519Two: String? =
      MyApp.getInstance().resources.getString(R.string.msg_block_5_abc_mo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStructureCounterThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_structure_13)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVRIDAG202519Three: String? =
      MyApp.getInstance().resources.getString(R.string.msg_block_5_abc_mo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStructureCounterFour: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_structure_14)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVRIDAG202519Four: String? =
      MyApp.getInstance().resources.getString(R.string.msg_block_5_abc_mo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etSearchValue: String? = null
)
