package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstepsix.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EditVaccinationRecordStepSixModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVaccinatorTask: String? =
      MyApp.getInstance().resources.getString(R.string.msg_edit_vaccinatio2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.msg_vaccination_det)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_step_2_of_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextbtn: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etBlockinformatiValue: String? =
      MyApp.getInstance().resources.getString(R.string.msg_fully_vaccinate)

)
