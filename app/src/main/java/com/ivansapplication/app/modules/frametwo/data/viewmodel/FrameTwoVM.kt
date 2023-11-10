package com.ivansapplication.app.modules.frametwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ivansapplication.app.modules.frametwo.`data`.model.FrameTwoModel
import org.koin.core.KoinComponent

class FrameTwoVM : ViewModel(), KoinComponent {
  val frameTwoModel: MutableLiveData<FrameTwoModel> = MutableLiveData(FrameTwoModel())

  var navArguments: Bundle? = null
}
