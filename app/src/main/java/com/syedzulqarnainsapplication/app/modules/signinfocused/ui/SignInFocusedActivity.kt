package com.syedzulqarnainsapplication.app.modules.signinfocused.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivitySignInFocusedBinding
import com.syedzulqarnainsapplication.app.modules.signinfocused.`data`.viewmodel.SignInFocusedVM
import com.syedzulqarnainsapplication.app.modules.signinfocusedone.ui.SignInFocusedOneActivity
import kotlin.String
import kotlin.Unit

class SignInFocusedActivity :
    BaseActivity<ActivitySignInFocusedBinding>(R.layout.activity_sign_in_focused) {
  private val viewModel: SignInFocusedVM by viewModels<SignInFocusedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signInFocusedVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.etField.setOnClickListener {
      val destIntent = SignInFocusedOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SIGN_IN_FOCUSED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignInFocusedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
