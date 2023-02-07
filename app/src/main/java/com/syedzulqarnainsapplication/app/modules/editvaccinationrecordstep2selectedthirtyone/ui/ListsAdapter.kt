package com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowLists5Binding
import com.syedzulqarnainsapplication.app.modules.editvaccinationrecordstep2selectedthirtyone.`data`.model.Lists5RowModel
import kotlin.Int
import kotlin.collections.List

class ListsAdapter(
  var list: List<Lists5RowModel>
) : RecyclerView.Adapter<ListsAdapter.RowLists5VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLists5VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_lists5,parent,false)
    return RowLists5VH(view)
  }

  override fun onBindViewHolder(holder: RowLists5VH, position: Int) {
    val lists5RowModel = Lists5RowModel()
    // TODO uncomment following line after integration with data source
    // val lists5RowModel = list[position]
    holder.binding.lists5RowModel = lists5RowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Lists5RowModel>) {
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
      item: Lists5RowModel
    ) {
    }
  }

  inner class RowLists5VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLists5Binding = RowLists5Binding.bind(itemView)
  }
}
