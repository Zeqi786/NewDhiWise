package com.syedzulqarnainsapplication.app.modules.structureprofiletwo.ui

import android.view.View
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityStructureProfileTwoBinding
import com.syedzulqarnainsapplication.app.modules.familyprofile.ui.FamilyProfileActivity
import com.syedzulqarnainsapplication.app.modules.structureprofiletwo.`data`.model.Listmohalla7RowModel
import com.syedzulqarnainsapplication.app.modules.structureprofiletwo.`data`.viewmodel.StructureProfileTwoVM
import com.syedzulqarnainsapplication.app.modules.tasklisttwo.ui.TaskListTwoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class StructureProfileTwoActivity :
    BaseActivity<ActivityStructureProfileTwoBinding>(R.layout.activity_structure_profile_two) {
  private val viewModel: StructureProfileTwoVM by viewModels<StructureProfileTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listmohallaAdapter =
    ListmohallaAdapter(viewModel.listmohallaList.value?:mutableListOf())
    binding.recyclerListmohalla.adapter = listmohallaAdapter
    listmohallaAdapter.setOnItemClickListener(
    object : ListmohallaAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listmohalla7RowModel) {
        onClickRecyclerListmohalla(view, position, item)
      }
    }
    )
    viewModel.listmohallaList.observe(this) {
      listmohallaAdapter.updateData(it)
    }
    binding.structureProfileTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowuser.setOnClickListener {
      val destIntent = FamilyProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnCompleteTask.setOnClickListener {
      val destIntent = TaskListTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListmohalla(
    view: View,
    position: Int,
    item: Listmohalla7RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "STRUCTURE_PROFILE_TWO_ACTIVITY"

  }
}
