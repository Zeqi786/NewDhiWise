package com.syedzulqarnainsapplication.app.modules.signindefault.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivitySignInDefaultBinding
import com.syedzulqarnainsapplication.app.modules.signindefault.`data`.viewmodel.SignInDefaultVM
import com.syedzulqarnainsapplication.app.modules.signinfocused.ui.SignInFocusedActivity
import kotlin.String
import kotlin.Unit

class SignInDefaultActivity :
    BaseActivity<ActivitySignInDefaultBinding>(R.layout.activity_sign_in_default) {
  private val viewModel: SignInDefaultVM by viewModels<SignInDefaultVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signInDefaultVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = SignInFocusedActivity.getIntent(this, null)
      startActivity(destIntent)
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "SIGN_IN_DEFAULT_ACTIVITY"

    }
  }
