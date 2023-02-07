package com.syedzulqarnainsapplication.app.modules.addchildone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.appcomponents.views.DatePickerFragment
import com.syedzulqarnainsapplication.app.databinding.ActivityAddChildOneBinding
import com.syedzulqarnainsapplication.app.modules.addchildone.`data`.viewmodel.AddChildOneVM
import java.util.Date
import kotlin.String
import kotlin.Unit

class AddChildOneActivity :
    BaseActivity<ActivityAddChildOneBinding>(R.layout.activity_add_child_one) {
  private val viewModel: AddChildOneVM by viewModels<AddChildOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addChildOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearField.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
          selectedDate ->
        onDateSelectedLinearField(selectedDate)
      }
    }
    binding.imageClose.setOnClickListener {
      finish()
    }
  }

  private fun onDateSelectedLinearField(selectedDate: Date) {
  }

  companion object {
    const val TAG: String = "ADD_CHILD_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddChildOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
