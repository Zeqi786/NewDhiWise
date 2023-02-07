package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtythree.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EditVaccinationRecordStep2SelectedThirtythreeModel(
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
  var txtLabel: String? = MyApp.getInstance().resources.getString(R.string.msg_is_the_family_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextbtn: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextbartoolc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_vaccine_hesitan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextbartoolcOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_not_willing_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextbartoolcTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_caregiver_is_bu2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextbartoolcThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_father_is_not_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etBlockinformatiValue: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_unvaccinated)

)
