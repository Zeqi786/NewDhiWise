package com.syedzulqarnainsapplication.app.modules.followuptask.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityFollowUpTaskBinding
import com.syedzulqarnainsapplication.app.modules.followuptask.`data`.model.FollowUpTaskRowModel
import com.syedzulqarnainsapplication.app.modules.followuptask.`data`.model.SpinnerFieldModel
import com.syedzulqarnainsapplication.app.modules.followuptask.`data`.viewmodel.FollowUpTaskVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FollowUpTaskActivity :
    BaseActivity<ActivityFollowUpTaskBinding>(R.layout.activity_follow_up_task) {
  private val viewModel: FollowUpTaskVM by viewModels<FollowUpTaskVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerFieldList.value = mutableListOf(
    SpinnerFieldModel("Item1"),
    SpinnerFieldModel("Item2"),
    SpinnerFieldModel("Item3"),
    SpinnerFieldModel("Item4"),
    SpinnerFieldModel("Item5")
    )
    val spinnerFieldAdapter =
    SpinnerFieldAdapter(this,R.layout.spinner_item,viewModel.spinnerFieldList.value?:
    mutableListOf())
    binding.spinnerField.adapter = spinnerFieldAdapter
    val followupTaskAdapter =
    FollowupTaskAdapter(viewModel.followupTaskList.value?:mutableListOf())
    binding.recyclerFollowupTask.adapter = followupTaskAdapter
    followupTaskAdapter.setOnItemClickListener(
    object : FollowupTaskAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : FollowUpTaskRowModel) {
        onClickRecyclerFollowupTask(view, position, item)
      }
    }
    )
    viewModel.followupTaskList.observe(this) {
      followupTaskAdapter.updateData(it)
    }
    binding.followUpTaskVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerFollowupTask(
    view: View,
    position: Int,
    item: FollowUpTaskRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FOLLOW_UP_TASK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FollowUpTaskActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
