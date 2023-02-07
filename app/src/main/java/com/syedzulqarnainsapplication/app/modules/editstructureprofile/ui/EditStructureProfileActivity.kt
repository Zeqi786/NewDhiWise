package com.syedzulqarnainsapplication.app.modules.editstructureprofile.ui

import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityEditStructureProfileBinding
import com.syedzulqarnainsapplication.app.modules.editstructureprofile.`data`.viewmodel.EditStructureProfileVM
import com.syedzulqarnainsapplication.app.modules.structureprofileone.ui.StructureProfileOneActivity
import kotlin.String
import kotlin.Unit

class EditStructureProfileActivity :
    BaseActivity<ActivityEditStructureProfileBinding>(R.layout.activity_edit_structure_profile) {
  private val viewModel: EditStructureProfileVM by viewModels<EditStructureProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editStructureProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      finish()
    }
    binding.btnSaveChanges.setOnClickListener {
      val destIntent = StructureProfileOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_STRUCTURE_PROFILE_ACTIVITY"

  }
}
