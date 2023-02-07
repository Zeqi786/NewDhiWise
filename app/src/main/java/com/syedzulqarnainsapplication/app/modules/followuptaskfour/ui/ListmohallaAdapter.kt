package com.syedzulqarnainsapplication.app.modules.followuptaskfour.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowListmohalla6Binding
import com.syedzulqarnainsapplication.app.modules.followuptaskfour.`data`.model.Listmohalla6RowModel
import kotlin.Int
import kotlin.collections.List

class ListmohallaAdapter(
  var list: List<Listmohalla6RowModel>
) : RecyclerView.Adapter<ListmohallaAdapter.RowListmohalla6VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmohalla6VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmohalla6,parent,false)
    return RowListmohalla6VH(view)
  }

  override fun onBindViewHolder(holder: RowListmohalla6VH, position: Int) {
    val listmohalla6RowModel = Listmohalla6RowModel()
    // TODO uncomment following line after integration with data source
    // val listmohalla6RowModel = list[position]
    holder.binding.listmohalla6RowModel = listmohalla6RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listmohalla6RowModel>) {
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
      item: Listmohalla6RowModel
    ) {
    }
  }

  inner class RowListmohalla6VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmohalla6Binding = RowListmohalla6Binding.bind(itemView)
  }
}
