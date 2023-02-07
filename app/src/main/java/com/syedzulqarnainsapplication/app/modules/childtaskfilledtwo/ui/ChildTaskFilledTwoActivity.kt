package com.syedzulqarnainsapplication.app.modules.childtaskfilledtwo.ui

import android.view.View
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityChildTaskFilledTwoBinding
import com.syedzulqarnainsapplication.app.modules.childprofile.ui.ChildProfileActivity
import com.syedzulqarnainsapplication.app.modules.childtaskfilledtwo.`data`.model.Listage2RowModel
import com.syedzulqarnainsapplication.app.modules.childtaskfilledtwo.`data`.model.Listmothername2RowModel
import com.syedzulqarnainsapplication.app.modules.childtaskfilledtwo.`data`.viewmodel.ChildTaskFilledTwoVM
import com.syedzulqarnainsapplication.app.modules.childtaskfocused.ui.ChildTaskFocusedActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ChildTaskFilledTwoActivity :
    BaseActivity<ActivityChildTaskFilledTwoBinding>(R.layout.activity_child_task_filled_two) {
  private val viewModel: ChildTaskFilledTwoVM by viewModels<ChildTaskFilledTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listageAdapter = ListageAdapter(viewModel.listageList.value?:mutableListOf())
    binding.recyclerListage.adapter = listageAdapter
    listageAdapter.setOnItemClickListener(
    object : ListageAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listage2RowModel) {
        onClickRecyclerListage(view, position, item)
      }
    }
    )
    viewModel.listageList.observe(this) {
      listageAdapter.updateData(it)
    }
    val listmothernameAdapter =
    ListmothernameAdapter(viewModel.listmothernameList.value?:mutableListOf())
    binding.recyclerListmothername.adapter = listmothernameAdapter
    listmothernameAdapter.setOnItemClickListener(
    object : ListmothernameAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listmothername2RowModel) {
        onClickRecyclerListmothername(view, position, item)
      }
    }
    )
    viewModel.listmothernameList.observe(this) {
      listmothernameAdapter.updateData(it)
    }
    binding.childTaskFilledTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.spinnerField.setOnClickListener {
      val destIntent = ChildTaskFocusedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnCompleteActionOne.setOnClickListener {
      val destIntent = ChildProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListage(
    view: View,
    position: Int,
    item: Listage2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListmothername(
    view: View,
    position: Int,
    item: Listmothername2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CHILD_TASK_FILLED_TWO_ACTIVITY"

  }
}
