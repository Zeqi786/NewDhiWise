package com.syedzulqarnainsapplication.app.modules.addstructure.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityAddStructureBinding
import com.syedzulqarnainsapplication.app.modules.addstructure.`data`.viewmodel.AddStructureVM
import com.syedzulqarnainsapplication.app.modules.addstructureone.ui.AddStructureOneDialog
import kotlin.String
import kotlin.Unit

class AddStructureActivity :
    BaseActivity<ActivityAddStructureBinding>(R.layout.activity_add_structure) {
  private val viewModel: AddStructureVM by viewModels<AddStructureVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addStructureVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnAddStructure.setOnClickListener {
      val destFragment = AddStructureOneDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager, AddStructureOneDialog.TAG)
    }
  }

  companion object {
    const val TAG: String = "ADD_STRUCTURE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddStructureActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
