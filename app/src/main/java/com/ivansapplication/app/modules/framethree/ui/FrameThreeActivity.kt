package com.ivansapplication.app.modules.framethree.ui

import androidx.activity.viewModels
import com.ivansapplication.app.R
import com.ivansapplication.app.appcomponents.base.BaseActivity
import com.ivansapplication.app.databinding.ActivityFrameThreeBinding
import com.ivansapplication.app.modules.framethree.`data`.viewmodel.FrameThreeVM
import kotlin.String
import kotlin.Unit

class FrameThreeActivity : BaseActivity<ActivityFrameThreeBinding>(R.layout.activity_frame_three) {
  private val viewModel: FrameThreeVM by viewModels<FrameThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FRAME_THREE_ACTIVITY"

  }
}
