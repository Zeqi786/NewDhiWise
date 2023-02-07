package com.syedzulqarnainsapplication.app.modules.followuptaskfour.ui

import android.view.View
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityFollowUpTaskFourBinding
import com.syedzulqarnainsapplication.app.modules.followuptaskfive.ui.FollowUpTaskFiveActivity
import com.syedzulqarnainsapplication.app.modules.followuptaskfour.`data`.model.Listmohalla6RowModel
import com.syedzulqarnainsapplication.app.modules.followuptaskfour.`data`.viewmodel.FollowUpTaskFourVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FollowUpTaskFourActivity :
    BaseActivity<ActivityFollowUpTaskFourBinding>(R.layout.activity_follow_up_task_four) {
  private val viewModel: FollowUpTaskFourVM by viewModels<FollowUpTaskFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listmohallaAdapter =
    ListmohallaAdapter(viewModel.listmohallaList.value?:mutableListOf())
    binding.recyclerListmohalla.adapter = listmohallaAdapter
    listmohallaAdapter.setOnItemClickListener(
    object : ListmohallaAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listmohalla6RowModel) {
        onClickRecyclerListmohalla(view, position, item)
      }
    }
    )
    viewModel.listmohallaList.observe(this) {
      listmohallaAdapter.updateData(it)
    }
    binding.followUpTaskFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.spinnerField.setOnClickListener {
      val destIntent = FollowUpTaskFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListmohalla(
    view: View,
    position: Int,
    item: Listmohalla6RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FOLLOW_UP_TASK_FOUR_ACTIVITY"

  }
}
