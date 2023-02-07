package com.syedzulqarnainsapplication.app.modules.searchchild1.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.appcomponents.di.MyApp
import com.syedzulqarnainsapplication.app.modules.searchchild.ui.SearchChildFragment
import com.syedzulqarnainsapplication.app.modules.searchwoman.ui.SearchWomanFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class SearchChild1ActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_woman),MyApp.getInstance().resources.getString(R.string.lbl_child))

        val viewPages: List<Fragment> = listOf(SearchWomanFragment(),SearchChildFragment())

    }
}
