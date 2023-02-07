package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyfive.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowLists4Binding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyfive.`data`.model.Lists4RowModel
import kotlin.Int
import kotlin.collections.List

class ListsAdapter(
  var list: List<Lists4RowModel>
) : RecyclerView.Adapter<ListsAdapter.RowLists4VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLists4VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_lists4,parent,false)
    return RowLists4VH(view)
  }

  override fun onBindViewHolder(holder: RowLists4VH, position: Int) {
    val lists4RowModel = Lists4RowModel()
    // TODO uncomment following line after integration with data source
    // val lists4RowModel = list[position]
    holder.binding.lists4RowModel = lists4RowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Lists4RowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: Lists4RowModel
    ) {
    }
  }

  inner class RowLists4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLists4Binding = RowLists4Binding.bind(itemView)
  }
}
