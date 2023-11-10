package com.ivansapplication.app.modules.frameone.`data`.model

import com.ivansapplication.app.R
import com.ivansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FrameOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtModesText: String? = MyApp.getInstance().resources.getString(R.string.lbl4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtModeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRainbowText: String? = MyApp.getInstance().resources.getString(R.string.lbl6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneColorText: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtActiveColorTe: String? = MyApp.getInstance().resources.getString(R.string.lbl7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourColorsOne: String? = MyApp.getInstance().resources.getString(R.string.msg3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPercentPower: String? = MyApp.getInstance().resources.getString(R.string.lbl_10)
  ,
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

)
