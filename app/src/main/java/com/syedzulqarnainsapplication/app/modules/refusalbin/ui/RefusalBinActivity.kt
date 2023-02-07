package com.syedzulqarnainsapplication.app.modules.refusalbin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.base.BaseActivity
import com.syedzulqarnainsapplication.app.databinding.ActivityRefusalBinBinding
import com.syedzulqarnainsapplication.app.modules.refusalbin.`data`.viewmodel.RefusalBinVM
import com.syedzulqarnainsapplication.app.modules.refusalbinalloptions.ui.RefusalBinAllOptionsActivity
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class RefusalBinActivity : BaseActivity<ActivityRefusalBinBinding>(R.layout.activity_refusal_bin) {
  private val viewModel: RefusalBinVM by viewModels<RefusalBinVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.refusalBinVM = viewModel
    setUpSearchViewComponentListener()
  }

  override fun setUpClicks(): Unit {
    binding.spinnerDropdown.setOnClickListener {
      val destIntent = RefusalBinAllOptionsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageClose.setOnClickListener {
      finish()
    }
  }

  private fun setUpSearchViewComponentListener(): Unit {
    binding.searchViewComponent.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "REFUSAL_BIN_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, RefusalBinActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
