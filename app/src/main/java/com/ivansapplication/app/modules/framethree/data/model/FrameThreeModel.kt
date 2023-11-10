package com.ivansapplication.app.modules.framethree.`data`.model

import com.ivansapplication.app.R
import com.ivansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FrameThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMain: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLight: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConnect: String? = MyApp.getInstance().resources.getString(R.string.lbl3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGuideWifiTex: String? = MyApp.getInstance().resources.getString(R.string.msg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInformationCon: String? = MyApp.getInstance().resources.getString(R.string.msg2)

)
