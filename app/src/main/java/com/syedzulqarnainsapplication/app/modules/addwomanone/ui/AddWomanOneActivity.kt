package com.syedzulqarnainsapplication.app.modules.addwomanone.ui

import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityAddWomanOneBinding
import com.syedzulqarnainsapplication.app.modules.addwomanone.`data`.viewmodel.AddWomanOneVM
import com.syedzulqarnainsapplication.app.modules.structureprofile.ui.StructureProfileActivity
import kotlin.String
import kotlin.Unit

class AddWomanOneActivity :
    BaseActivity<ActivityAddWomanOneBinding>(R.layout.activity_add_woman_one) {
  private val viewModel: AddWomanOneVM by viewModels<AddWomanOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addWomanOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSubmit.setOnClickListener {
      val destIntent = StructureProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ADD_WOMAN_ONE_ACTIVITY"

  }
}
