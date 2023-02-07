package com.syedzulqarnainsapplication.app.modules.signinfocusedone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivitySignInFocusedOneBinding
import com.syedzulqarnainsapplication.app.modules.signinfocusedone.`data`.viewmodel.SignInFocusedOneVM
import com.syedzulqarnainsapplication.app.modules.tasklistone.ui.TaskListOneActivity
import kotlin.String
import kotlin.Unit

class SignInFocusedOneActivity :
    BaseActivity<ActivitySignInFocusedOneBinding>(R.layout.activity_sign_in_focused_one) {
  private val viewModel: SignInFocusedOneVM by viewModels<SignInFocusedOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signInFocusedOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSignInOne.setOnClickListener {
      val destIntent = TaskListOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SIGN_IN_FOCUSED_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignInFocusedOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
