package com.syedzulqarnainsapplication.app.modules.followuptasktwo.ui

import android.view.View
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityFollowUpTaskTwoBinding
import com.syedzulqarnainsapplication.app.modules.followuptasktwo.`data`.model.ListmohallaRowModel
import com.syedzulqarnainsapplication.app.modules.followuptasktwo.`data`.model.SpinnerFieldModel
import com.syedzulqarnainsapplication.app.modules.followuptasktwo.`data`.viewmodel.FollowUpTaskTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FollowUpTaskTwoActivity :
    BaseActivity<ActivityFollowUpTaskTwoBinding>(R.layout.activity_follow_up_task_two) {
  private val viewModel: FollowUpTaskTwoVM by viewModels<FollowUpTaskTwoVM>()

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
    val listmohallaAdapter =
    ListmohallaAdapter(viewModel.listmohallaList.value?:mutableListOf())
    binding.recyclerListmohalla.adapter = listmohallaAdapter
    listmohallaAdapter.setOnItemClickListener(
    object : ListmohallaAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListmohallaRowModel) {
        onClickRecyclerListmohalla(view, position, item)
      }
    }
    )
    viewModel.listmohallaList.observe(this) {
      listmohallaAdapter.updateData(it)
    }
    binding.followUpTaskTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListmohalla(
    view: View,
    position: Int,
    item: ListmohallaRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FOLLOW_UP_TASK_TWO_ACTIVITY"

  }
}
