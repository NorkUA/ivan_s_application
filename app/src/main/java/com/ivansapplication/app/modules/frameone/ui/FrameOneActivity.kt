package com.ivansapplication.app.modules.frameone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ivansapplication.app.R
import com.ivansapplication.app.appcomponents.base.BaseActivity
import com.ivansapplication.app.databinding.ActivityFrameOneBinding
import com.ivansapplication.app.modules.frameone.`data`.viewmodel.FrameOneVM
import kotlin.String
import kotlin.Unit

class FrameOneActivity : BaseActivity<ActivityFrameOneBinding>(R.layout.activity_frame_one) {
  private val viewModel: FrameOneVM by viewModels<FrameOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FRAME_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrameOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
