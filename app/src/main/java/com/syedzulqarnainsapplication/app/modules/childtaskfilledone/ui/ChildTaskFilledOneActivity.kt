package com.syedzulqarnainsapplication.app.modules.childtaskfilledone.ui

import android.view.View
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityChildTaskFilledOneBinding
import com.syedzulqarnainsapplication.app.modules.childtaskfilledone.`data`.model.Listage4RowModel
import com.syedzulqarnainsapplication.app.modules.childtaskfilledone.`data`.model.Listmothername4RowModel
import com.syedzulqarnainsapplication.app.modules.childtaskfilledone.`data`.viewmodel.ChildTaskFilledOneVM
import com.syedzulqarnainsapplication.app.modules.childtaskfocused.ui.ChildTaskFocusedActivity
import com.syedzulqarnainsapplication.app.modules.tasklistone.ui.TaskListOneActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ChildTaskFilledOneActivity :
    BaseActivity<ActivityChildTaskFilledOneBinding>(R.layout.activity_child_task_filled_one) {
  private val viewModel: ChildTaskFilledOneVM by viewModels<ChildTaskFilledOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listageAdapter = ListageAdapter(viewModel.listageList.value?:mutableListOf())
    binding.recyclerListage.adapter = listageAdapter
    listageAdapter.setOnItemClickListener(
    object : ListageAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listage4RowModel) {
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
      override fun onItemClick(view:View, position:Int, item : Listmothername4RowModel) {
        onClickRecyclerListmothername(view, position, item)
      }
    }
    )
    viewModel.listmothernameList.observe(this) {
      listmothernameAdapter.updateData(it)
    }
    binding.childTaskFilledOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCompleteActionOne.setOnClickListener {
      val destIntent = TaskListOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.spinnerField.setOnClickListener {
      val destIntent = ChildTaskFocusedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListage(
    view: View,
    position: Int,
    item: Listage4RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListmothername(
    view: View,
    position: Int,
    item: Listmothername4RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CHILD_TASK_FILLED_ONE_ACTIVITY"

  }
}
