package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentyeight.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EditVaccinationRecordStep2SelectedTwentyeightModel(
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
  var txtButtontext: String? = MyApp.getInstance().resources.getString(R.string.lbl_submit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_fear_of_fever_a2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMenu1Menu2M: String? =
      MyApp.getInstance().resources.getString(R.string.msg_fear_of_pain_re)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_vaccination_ser)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMenu1Menu2MOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_vaccines_are_no)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMenu1Menu2MTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_not_aware_of_va)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMenu1Menu2MThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_distance_from_v)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMenu1Menu2MFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_caregiver_is_bu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etBlockinformatiValue: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_unvaccinated)

)
