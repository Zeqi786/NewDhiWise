package com.syedzulqarnainsapplication.app.modules.addstructuretwo.ui

import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityAddStructureTwoBinding
import com.syedzulqarnainsapplication.app.modules.addstructure.ui.AddStructureActivity
import com.syedzulqarnainsapplication.app.modules.addstructuretwo.`data`.viewmodel.AddStructureTwoVM
import kotlin.String
import kotlin.Unit

class AddStructureTwoActivity :
    BaseActivity<ActivityAddStructureTwoBinding>(R.layout.activity_add_structure_two) {
  private val viewModel: AddStructureTwoVM by viewModels<AddStructureTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addStructureTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.spinnerField.setOnClickListener {
      val destIntent = AddStructureActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ADD_STRUCTURE_TWO_ACTIVITY"

  }
}
