package com.syedzulqarnainsapplication.app.modules.childtaskfilled.ui

import android.view.View
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityChildTaskFilledBinding
import com.syedzulqarnainsapplication.app.modules.childtaskfilled.`data`.model.Listage3RowModel
import com.syedzulqarnainsapplication.app.modules.childtaskfilled.`data`.model.Listmothername3RowModel
import com.syedzulqarnainsapplication.app.modules.childtaskfilled.`data`.viewmodel.ChildTaskFilledVM
import com.syedzulqarnainsapplication.app.modules.childtaskfocused.ui.ChildTaskFocusedActivity
import com.syedzulqarnainsapplication.app.modules.tasklistone.ui.TaskListOneActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ChildTaskFilledActivity :
    BaseActivity<ActivityChildTaskFilledBinding>(R.layout.activity_child_task_filled) {
  private val viewModel: ChildTaskFilledVM by viewModels<ChildTaskFilledVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listageAdapter = ListageAdapter(viewModel.listageList.value?:mutableListOf())
    binding.recyclerListage.adapter = listageAdapter
    listageAdapter.setOnItemClickListener(
    object : ListageAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listage3RowModel) {
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
      override fun onItemClick(view:View, position:Int, item : Listmothername3RowModel) {
        onClickRecyclerListmothername(view, position, item)
      }
    }
    )
    viewModel.listmothernameList.observe(this) {
      listmothernameAdapter.updateData(it)
    }
    binding.childTaskFilledVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.spinnerField.setOnClickListener {
      val destIntent = ChildTaskFocusedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnCompleteActionOne.setOnClickListener {
      val destIntent = TaskListOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListage(
    view: View,
    position: Int,
    item: Listage3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListmothername(
    view: View,
    position: Int,
    item: Listmothername3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CHILD_TASK_FILLED_ACTIVITY"

  }
}
