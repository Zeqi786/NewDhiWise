package com.syedzulqarnainsapplication.app.modules.structureprofiletwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowListmohalla7Binding
import com.syedzulqarnainsapplication.app.modules.structureprofiletwo.`data`.model.Listmohalla7RowModel
import kotlin.Int
import kotlin.collections.List

class ListmohallaAdapter(
  var list: List<Listmohalla7RowModel>
) : RecyclerView.Adapter<ListmohallaAdapter.RowListmohalla7VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmohalla7VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmohalla7,parent,false)
    return RowListmohalla7VH(view)
  }

  override fun onBindViewHolder(holder: RowListmohalla7VH, position: Int) {
    val listmohalla7RowModel = Listmohalla7RowModel()
    // TODO uncomment following line after integration with data source
    // val listmohalla7RowModel = list[position]
    holder.binding.listmohalla7RowModel = listmohalla7RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listmohalla7RowModel>) {
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
      item: Listmohalla7RowModel
    ) {
    }
  }

  inner class RowListmohalla7VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmohalla7Binding = RowListmohalla7Binding.bind(itemView)
  }
}
