package com.syedzulqarnainsapplication.app.modules.childprofileone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityChildProfileOneBinding
import com.syedzulqarnainsapplication.app.modules.childprofileone.`data`.model.Listage6RowModel
import com.syedzulqarnainsapplication.app.modules.childprofileone.`data`.model.Listbcg1RowModel
import com.syedzulqarnainsapplication.app.modules.childprofileone.`data`.viewmodel.ChildProfileOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ChildProfileOneActivity :
    BaseActivity<ActivityChildProfileOneBinding>(R.layout.activity_child_profile_one) {
  private val viewModel: ChildProfileOneVM by viewModels<ChildProfileOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listageAdapter = ListageAdapter(viewModel.listageList.value?:mutableListOf())
    binding.recyclerListage.adapter = listageAdapter
    listageAdapter.setOnItemClickListener(
    object : ListageAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listage6RowModel) {
        onClickRecyclerListage(view, position, item)
      }
    }
    )
    viewModel.listageList.observe(this) {
      listageAdapter.updateData(it)
    }
    val listbcgAdapter = ListbcgAdapter(viewModel.listbcgList.value?:mutableListOf())
    binding.recyclerListbcg.adapter = listbcgAdapter
    listbcgAdapter.setOnItemClickListener(
    object : ListbcgAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listbcg1RowModel) {
        onClickRecyclerListbcg(view, position, item)
      }
    }
    )
    viewModel.listbcgList.observe(this) {
      listbcgAdapter.updateData(it)
    }
    binding.childProfileOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListage(
    view: View,
    position: Int,
    item: Listage6RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListbcg(
    view: View,
    position: Int,
    item: Listbcg1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CHILD_PROFILE_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChildProfileOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
