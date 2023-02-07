package com.syedzulqarnainsapplication.app.modules.addwomanfive.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AddWomanFiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVaccinatorTask: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_woman2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.msg_demographic_inf)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_step_1_of_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_marital_status)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_ethnicity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextFourteen: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_42201_4839202_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_cnic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextFifteen: String? = MyApp.getInstance().resources.getString(R.string.msg_abc_mohallla_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_address2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextSixteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_123)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelSeven: String? = MyApp.getInstance().resources.getString(R.string.msg_sina_family_num)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTextTwoValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_shazia_ali)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etDateValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_01_08_2000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTextThreeValue: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mohammad_ali_ak)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTextSevenValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_0331_4948203)

)
