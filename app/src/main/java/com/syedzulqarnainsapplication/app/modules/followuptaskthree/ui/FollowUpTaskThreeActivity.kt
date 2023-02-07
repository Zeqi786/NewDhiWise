package com.syedzulqarnainsapplication.app.modules.followuptaskthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityFollowUpTaskThreeBinding
import com.syedzulqarnainsapplication.app.modules.followuptaskfive.ui.FollowUpTaskFiveActivity
import com.syedzulqarnainsapplication.app.modules.followuptaskthree.`data`.model.Listmohalla4RowModel
import com.syedzulqarnainsapplication.app.modules.followuptaskthree.`data`.viewmodel.FollowUpTaskThreeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FollowUpTaskThreeActivity :
    BaseActivity<ActivityFollowUpTaskThreeBinding>(R.layout.activity_follow_up_task_three) {
  private val viewModel: FollowUpTaskThreeVM by viewModels<FollowUpTaskThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listmohallaAdapter =
    ListmohallaAdapter(viewModel.listmohallaList.value?:mutableListOf())
    binding.recyclerListmohalla.adapter = listmohallaAdapter
    listmohallaAdapter.setOnItemClickListener(
    object : ListmohallaAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listmohalla4RowModel) {
        onClickRecyclerListmohalla(view, position, item)
      }
    }
    )
    viewModel.listmohallaList.observe(this) {
      listmohallaAdapter.updateData(it)
    }
    binding.followUpTaskThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.spinnerField.setOnClickListener {
      val destIntent = FollowUpTaskFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListmohalla(
    view: View,
    position: Int,
    item: Listmohalla4RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FOLLOW_UP_TASK_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FollowUpTaskThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
