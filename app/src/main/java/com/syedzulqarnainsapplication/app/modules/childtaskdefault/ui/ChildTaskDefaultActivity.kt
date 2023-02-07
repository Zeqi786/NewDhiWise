package com.syedzulqarnainsapplication.app.modules.childtaskdefault.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityChildTaskDefaultBinding
import com.syedzulqarnainsapplication.app.modules.childtaskdefault.`data`.model.ListageRowModel
import com.syedzulqarnainsapplication.app.modules.childtaskdefault.`data`.model.ListmothernameRowModel
import com.syedzulqarnainsapplication.app.modules.childtaskdefault.`data`.viewmodel.ChildTaskDefaultVM
import com.syedzulqarnainsapplication.app.modules.childtaskfocused.ui.ChildTaskFocusedActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ChildTaskDefaultActivity :
    BaseActivity<ActivityChildTaskDefaultBinding>(R.layout.activity_child_task_default) {
  private val viewModel: ChildTaskDefaultVM by viewModels<ChildTaskDefaultVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listageAdapter = ListageAdapter(viewModel.listageList.value?:mutableListOf())
    binding.recyclerListage.adapter = listageAdapter
    listageAdapter.setOnItemClickListener(
    object : ListageAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListageRowModel) {
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
      override fun onItemClick(view:View, position:Int, item : ListmothernameRowModel) {
        onClickRecyclerListmothername(view, position, item)
      }
    }
    )
    viewModel.listmothernameList.observe(this) {
      listmothernameAdapter.updateData(it)
    }
    binding.childTaskDefaultVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.spinnerField.setOnClickListener {
      val destIntent = ChildTaskFocusedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListage(
    view: View,
    position: Int,
    item: ListageRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListmothername(
    view: View,
    position: Int,
    item: ListmothernameRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CHILD_TASK_DEFAULT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChildTaskDefaultActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
