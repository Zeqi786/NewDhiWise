package com.syedzulqarnainsapplication.app.modules.addstructureone.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseDialogFragment
import com.syedzulqarnainsapplication.app.databinding.DialogAddStructureOneBinding
import com.syedzulqarnainsapplication.app.modules.addstructureone.`data`.viewmodel.AddStructureOneVM
import com.syedzulqarnainsapplication.app.modules.followuptask.ui.FollowUpTaskActivity
import kotlin.String
import kotlin.Unit

class AddStructureOneDialog :
    BaseDialogFragment<DialogAddStructureOneBinding>(R.layout.dialog_add_structure_one) {
  private val viewModel: AddStructureOneVM by viewModels<AddStructureOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.addStructureOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnDone.setOnClickListener {
      val destIntent = FollowUpTaskActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "ADD_STRUCTURE_ONE_DIALOG"


    fun getInstance(bundle: Bundle?): AddStructureOneDialog {
      val fragment = AddStructureOneDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
