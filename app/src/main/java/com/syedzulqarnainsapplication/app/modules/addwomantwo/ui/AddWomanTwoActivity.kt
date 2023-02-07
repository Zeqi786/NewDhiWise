package com.syedzulqarnainsapplication.app.modules.addwomantwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.appcomponents.views.DatePickerFragment
import com.syedzulqarnainsapplication.app.databinding.ActivityAddWomanTwoBinding
import com.syedzulqarnainsapplication.app.modules.addwomanfive.ui.AddWomanFiveActivity
import com.syedzulqarnainsapplication.app.modules.addwomantwo.`data`.viewmodel.AddWomanTwoVM
import java.util.Date
import kotlin.String
import kotlin.Unit

class AddWomanTwoActivity :
    BaseActivity<ActivityAddWomanTwoBinding>(R.layout.activity_add_woman_two) {
  private val viewModel: AddWomanTwoVM by viewModels<AddWomanTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addWomanTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      finish()
    }
    binding.frameStackblockinformati.setOnClickListener {
      val destIntent = AddWomanFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearField1.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
          selectedDate ->
        onDateSelectedLinearField1(selectedDate)
      }
    }
  }

  private fun onDateSelectedLinearField1(selectedDate: Date) {
  }

  companion object {
    const val TAG: String = "ADD_WOMAN_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddWomanTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
