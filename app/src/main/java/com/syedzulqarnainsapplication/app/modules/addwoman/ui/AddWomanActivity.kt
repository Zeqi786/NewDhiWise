package com.syedzulqarnainsapplication.app.modules.addwoman.ui

import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityAddWomanBinding
import com.syedzulqarnainsapplication.app.modules.addwoman.`data`.viewmodel.AddWomanVM
import com.syedzulqarnainsapplication.app.modules.addwomanfive.ui.AddWomanFiveActivity
import com.syedzulqarnainsapplication.app.modules.addwomanthree.ui.AddWomanThreeActivity
import kotlin.String
import kotlin.Unit

class AddWomanActivity : BaseActivity<ActivityAddWomanBinding>(R.layout.activity_add_woman) {
  private val viewModel: AddWomanVM by viewModels<AddWomanVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addWomanVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSubmit.setOnClickListener {
      val destIntent = AddWomanThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = AddWomanFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ADD_WOMAN_ACTIVITY"

  }
}
