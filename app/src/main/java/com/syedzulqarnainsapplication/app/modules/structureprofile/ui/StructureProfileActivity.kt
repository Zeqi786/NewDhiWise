package com.syedzulqarnainsapplication.app.modules.structureprofile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityStructureProfileBinding
import com.syedzulqarnainsapplication.app.modules.structureprofile.`data`.model.Listmohalla3RowModel
import com.syedzulqarnainsapplication.app.modules.structureprofile.`data`.viewmodel.StructureProfileVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class StructureProfileActivity :
    BaseActivity<ActivityStructureProfileBinding>(R.layout.activity_structure_profile) {
  private val viewModel: StructureProfileVM by viewModels<StructureProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listmohallaAdapter =
    ListmohallaAdapter(viewModel.listmohallaList.value?:mutableListOf())
    binding.recyclerListmohalla.adapter = listmohallaAdapter
    listmohallaAdapter.setOnItemClickListener(
    object : ListmohallaAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listmohalla3RowModel) {
        onClickRecyclerListmohalla(view, position, item)
      }
    }
    )
    viewModel.listmohallaList.observe(this) {
      listmohallaAdapter.updateData(it)
    }
    binding.structureProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListmohalla(
    view: View,
    position: Int,
    item: Listmohalla3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "STRUCTURE_PROFILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, StructureProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
