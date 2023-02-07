package com.syedzulqarnainsapplication.app.modules.followuptaskthree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowListmohalla4Binding
import com.syedzulqarnainsapplication.app.modules.followuptaskthree.`data`.model.Listmohalla4RowModel
import kotlin.Int
import kotlin.collections.List

class ListmohallaAdapter(
  var list: List<Listmohalla4RowModel>
) : RecyclerView.Adapter<ListmohallaAdapter.RowListmohalla4VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmohalla4VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmohalla4,parent,false)
    return RowListmohalla4VH(view)
  }

  override fun onBindViewHolder(holder: RowListmohalla4VH, position: Int) {
    val listmohalla4RowModel = Listmohalla4RowModel()
    // TODO uncomment following line after integration with data source
    // val listmohalla4RowModel = list[position]
    holder.binding.listmohalla4RowModel = listmohalla4RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listmohalla4RowModel>) {
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
      item: Listmohalla4RowModel
    ) {
    }
  }

  inner class RowListmohalla4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmohalla4Binding = RowListmohalla4Binding.bind(itemView)
  }
}
