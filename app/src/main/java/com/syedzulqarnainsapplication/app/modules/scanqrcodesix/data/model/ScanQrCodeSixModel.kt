package com.syedzulqarnainsapplication.app.modules.scanqrcodesix.`data`.model

import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ScanQrCodeSixModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.msg_would_you_like2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextleft: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextleftOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_scan_qr_code2)

)
