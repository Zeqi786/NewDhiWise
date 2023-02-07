package com.syedzulqarnainsapplication.app.modules.addwomanfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityAddWomanFourBinding
import com.syedzulqarnainsapplication.app.modules.addwomanfive.ui.AddWomanFiveActivity
import com.syedzulqarnainsapplication.app.modules.addwomanfour.`data`.viewmodel.AddWomanFourVM
import kotlin.String
import kotlin.Unit

class AddWomanFourActivity :
    BaseActivity<ActivityAddWomanFourBinding>(R.layout.activity_add_woman_four) {
  private val viewModel: AddWomanFourVM by viewModels<AddWomanFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addWomanFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = AddWomanFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ADD_WOMAN_FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddWomanFourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
