package com.syedzulqarnainsapplication.app.modules.followuptaskone.ui

import android.view.View
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityFollowUpTaskOneBinding
import com.syedzulqarnainsapplication.app.modules.followuptaskone.`data`.model.Listmohalla1RowModel
import com.syedzulqarnainsapplication.app.modules.followuptaskone.`data`.model.SpinnerFieldModel
import com.syedzulqarnainsapplication.app.modules.followuptaskone.`data`.viewmodel.FollowUpTaskOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FollowUpTaskOneActivity :
    BaseActivity<ActivityFollowUpTaskOneBinding>(R.layout.activity_follow_up_task_one) {
  private val viewModel: FollowUpTaskOneVM by viewModels<FollowUpTaskOneVM>()

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
      override fun onItemClick(view:View, position:Int, item : Listmohalla1RowModel) {
        onClickRecyclerListmohalla(view, position, item)
      }
    }
    )
    viewModel.listmohallaList.observe(this) {
      listmohallaAdapter.updateData(it)
    }
    binding.followUpTaskOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListmohalla(
    view: View,
    position: Int,
    item: Listmohalla1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FOLLOW_UP_TASK_ONE_ACTIVITY"

  }
}
