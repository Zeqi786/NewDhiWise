package com.syedzulqarnainsapplication.app.modules.childtaskfocused.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityChildTaskFocusedBinding
import com.syedzulqarnainsapplication.app.modules.childtaskdefault.ui.ChildTaskDefaultActivity
import com.syedzulqarnainsapplication.app.modules.childtaskfocused.`data`.model.Listage1RowModel
import com.syedzulqarnainsapplication.app.modules.childtaskfocused.`data`.model.Listmothername1RowModel
import com.syedzulqarnainsapplication.app.modules.childtaskfocused.`data`.viewmodel.ChildTaskFocusedVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ChildTaskFocusedActivity :
    BaseActivity<ActivityChildTaskFocusedBinding>(R.layout.activity_child_task_focused) {
  private val viewModel: ChildTaskFocusedVM by viewModels<ChildTaskFocusedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listageAdapter = ListageAdapter(viewModel.listageList.value?:mutableListOf())
    binding.recyclerListage.adapter = listageAdapter
    listageAdapter.setOnItemClickListener(
    object : ListageAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listage1RowModel) {
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
      override fun onItemClick(view:View, position:Int, item : Listmothername1RowModel) {
        onClickRecyclerListmothername(view, position, item)
      }
    }
    )
    viewModel.listmothernameList.observe(this) {
      listmothernameAdapter.updateData(it)
    }
    binding.childTaskFocusedVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.spinnerField.setOnClickListener {
      val destIntent = ChildTaskDefaultActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListage(
    view: View,
    position: Int,
    item: Listage1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListmothername(
    view: View,
    position: Int,
    item: Listmothername1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CHILD_TASK_FOCUSED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChildTaskFocusedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
