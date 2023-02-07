package com.syedzulqarnainsapplication.app.modules.addwomanfive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityAddWomanFiveBinding
import com.syedzulqarnainsapplication.app.modules.addwomanfive.`data`.viewmodel.AddWomanFiveVM
import com.syedzulqarnainsapplication.app.modules.addwomanfour.ui.AddWomanFourActivity
import kotlin.String
import kotlin.Unit

class AddWomanFiveActivity :
    BaseActivity<ActivityAddWomanFiveBinding>(R.layout.activity_add_woman_five) {
  private val viewModel: AddWomanFiveVM by viewModels<AddWomanFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addWomanFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      finish()
    }
    binding.btnNext.setOnClickListener {
      val destIntent = AddWomanFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ADD_WOMAN_FIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddWomanFiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
