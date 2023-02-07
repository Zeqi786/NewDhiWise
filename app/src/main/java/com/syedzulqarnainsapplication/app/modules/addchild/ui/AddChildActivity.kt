package com.syedzulqarnainsapplication.app.modules.addchild.ui

import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityAddChildBinding
import com.syedzulqarnainsapplication.app.modules.addchild.`data`.viewmodel.AddChildVM
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordtwo.ui.EditVaccinationRecordTwoActivity
import kotlin.String
import kotlin.Unit

class AddChildActivity : BaseActivity<ActivityAddChildBinding>(R.layout.activity_add_child) {
  private val viewModel: AddChildVM by viewModels<AddChildVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addChildVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNext.setOnClickListener {
      val destIntent = EditVaccinationRecordTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageClose.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ADD_CHILD_ACTIVITY"

  }
}
