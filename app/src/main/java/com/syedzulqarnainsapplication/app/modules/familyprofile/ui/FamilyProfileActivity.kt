package com.syedzulqarnainsapplication.app.modules.familyprofile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityFamilyProfileBinding
import com.syedzulqarnainsapplication.app.modules.familyprofile.`data`.viewmodel.FamilyProfileVM
import kotlin.String
import kotlin.Unit

class FamilyProfileActivity :
    BaseActivity<ActivityFamilyProfileBinding>(R.layout.activity_family_profile) {
  private val viewModel: FamilyProfileVM by viewModels<FamilyProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.familyProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "FAMILY_PROFILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FamilyProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
