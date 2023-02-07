package com.syedzulqarnainsapplication.app.modules.addwomanthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityAddWomanThreeBinding
import com.syedzulqarnainsapplication.app.modules.addchildone.ui.AddChildOneActivity
import com.syedzulqarnainsapplication.app.modules.addwomanfive.ui.AddWomanFiveActivity
import com.syedzulqarnainsapplication.app.modules.addwomanthree.`data`.viewmodel.AddWomanThreeVM
import kotlin.String
import kotlin.Unit

class AddWomanThreeActivity :
    BaseActivity<ActivityAddWomanThreeBinding>(R.layout.activity_add_woman_three) {
  private val viewModel: AddWomanThreeVM by viewModels<AddWomanThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addWomanThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = AddWomanFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnPlus.setOnClickListener {
      val destIntent = AddChildOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ADD_WOMAN_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddWomanThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
