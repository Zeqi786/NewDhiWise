package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedtwentysix.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EditVaccinationRecordStep2SelectedTwentysixModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSELECTDATE: String? = MyApp.getInstance().resources.getString(R.string.lbl_select_date2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCANCEL: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOK: String? = MyApp.getInstance().resources.getString(R.string.lbl_ok)

)
