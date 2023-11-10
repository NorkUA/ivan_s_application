package com.ivansapplication.app.modules.frametwo.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.ivansapplication.app.R
import com.ivansapplication.app.appcomponents.base.BaseActivity
import com.ivansapplication.app.databinding.ActivityFrameTwoBinding
import com.ivansapplication.app.modules.frameone.ui.FrameOneActivity
import com.ivansapplication.app.modules.frametwo.`data`.viewmodel.FrameTwoVM
import kotlin.String
import kotlin.Unit

class FrameTwoActivity : BaseActivity<ActivityFrameTwoBinding>(R.layout.activity_frame_two) {
  private val viewModel: FrameTwoVM by viewModels<FrameTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameTwoVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = FrameOneActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "FRAME_TWO_ACTIVITY"

    }
  }
