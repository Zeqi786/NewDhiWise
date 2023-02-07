package com.syedzulqarnainsapplication.app.modules.followuptaskfive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityFollowUpTaskFiveBinding
import com.syedzulqarnainsapplication.app.modules.followuptaskfive.`data`.model.Listmohalla5RowModel
import com.syedzulqarnainsapplication.app.modules.followuptaskfive.`data`.viewmodel.FollowUpTaskFiveVM
import com.syedzulqarnainsapplication.app.modules.followuptaskthree.ui.FollowUpTaskThreeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FollowUpTaskFiveActivity :
    BaseActivity<ActivityFollowUpTaskFiveBinding>(R.layout.activity_follow_up_task_five) {
  private val viewModel: FollowUpTaskFiveVM by viewModels<FollowUpTaskFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listmohallaAdapter =
    ListmohallaAdapter(viewModel.listmohallaList.value?:mutableListOf())
    binding.recyclerListmohalla.adapter = listmohallaAdapter
    listmohallaAdapter.setOnItemClickListener(
    object : ListmohallaAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listmohalla5RowModel) {
        onClickRecyclerListmohalla(view, position, item)
      }
    }
    )
    viewModel.listmohallaList.observe(this) {
      listmohallaAdapter.updateData(it)
    }
    binding.followUpTaskFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.spinnerField.setOnClickListener {
      val destIntent = FollowUpTaskThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListmohalla(
    view: View,
    position: Int,
    item: Listmohalla5RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FOLLOW_UP_TASK_FIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FollowUpTaskFiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
