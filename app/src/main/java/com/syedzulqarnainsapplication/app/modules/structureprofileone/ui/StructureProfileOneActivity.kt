package com.syedzulqarnainsapplication.app.modules.structureprofileone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityStructureProfileOneBinding
import com.syedzulqarnainsapplication.app.modules.addwomantwo.ui.AddWomanTwoActivity
import com.syedzulqarnainsapplication.app.modules.structureprofileone.`data`.model.Listmohalla2RowModel
import com.syedzulqarnainsapplication.app.modules.structureprofileone.`data`.viewmodel.StructureProfileOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class StructureProfileOneActivity :
    BaseActivity<ActivityStructureProfileOneBinding>(R.layout.activity_structure_profile_one) {
  private val viewModel: StructureProfileOneVM by viewModels<StructureProfileOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listmohallaAdapter =
    ListmohallaAdapter(viewModel.listmohallaList.value?:mutableListOf())
    binding.recyclerListmohalla.adapter = listmohallaAdapter
    listmohallaAdapter.setOnItemClickListener(
    object : ListmohallaAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listmohalla2RowModel) {
        onClickRecyclerListmohalla(view, position, item)
      }
    }
    )
    viewModel.listmohallaList.observe(this) {
      listmohallaAdapter.updateData(it)
    }
    binding.structureProfileOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.etFrame110.setOnClickListener {
      val destIntent = AddWomanTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListmohalla(
    view: View,
    position: Int,
    item: Listmohalla2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "STRUCTURE_PROFILE_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, StructureProfileOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
