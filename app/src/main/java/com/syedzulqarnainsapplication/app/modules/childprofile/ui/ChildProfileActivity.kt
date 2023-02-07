package com.syedzulqarnainsapplication.app.modules.childprofile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityChildProfileBinding
import com.syedzulqarnainsapplication.app.modules.childprofile.`data`.model.Listage5RowModel
import com.syedzulqarnainsapplication.app.modules.childprofile.`data`.model.ListbcgRowModel
import com.syedzulqarnainsapplication.app.modules.childprofile.`data`.viewmodel.ChildProfileVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ChildProfileActivity :
    BaseActivity<ActivityChildProfileBinding>(R.layout.activity_child_profile) {
  private val viewModel: ChildProfileVM by viewModels<ChildProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listageAdapter = ListageAdapter(viewModel.listageList.value?:mutableListOf())
    binding.recyclerListage.adapter = listageAdapter
    listageAdapter.setOnItemClickListener(
    object : ListageAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listage5RowModel) {
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
      override fun onItemClick(view:View, position:Int, item : ListbcgRowModel) {
        onClickRecyclerListbcg(view, position, item)
      }
    }
    )
    viewModel.listbcgList.observe(this) {
      listbcgAdapter.updateData(it)
    }
    binding.childProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListage(
    view: View,
    position: Int,
    item: Listage5RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListbcg(
    view: View,
    position: Int,
    item: ListbcgRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CHILD_PROFILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChildProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
