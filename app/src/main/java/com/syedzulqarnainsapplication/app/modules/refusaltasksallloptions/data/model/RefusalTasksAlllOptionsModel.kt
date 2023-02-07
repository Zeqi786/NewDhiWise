package com.syedzulqarnainsapplication.app.modules.refusaltasksallloptions.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RefusalTasksAlllOptionsModel(
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
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.msg_search_by_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextaddressOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_luqman_khan)
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
  var txtTextbartoolc: String? = MyApp.getInstance().resources.getString(R.string.lbl_all_tasks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextbartoolcOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mobillization_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextbartoolcTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_routine_visit_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextbartoolcThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_refusal_tasks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextbartoolcFour: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_refusal_bin)

)
