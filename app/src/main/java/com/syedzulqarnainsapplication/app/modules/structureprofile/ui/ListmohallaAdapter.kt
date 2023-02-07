package com.syedzulqarnainsapplication.app.modules.structureprofile.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowListmohalla3Binding
import com.syedzulqarnainsapplication.app.modules.structureprofile.`data`.model.Listmohalla3RowModel
import kotlin.Int
import kotlin.collections.List

class ListmohallaAdapter(
  var list: List<Listmohalla3RowModel>
) : RecyclerView.Adapter<ListmohallaAdapter.RowListmohalla3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmohalla3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmohalla3,parent,false)
    return RowListmohalla3VH(view)
  }

  override fun onBindViewHolder(holder: RowListmohalla3VH, position: Int) {
    val listmohalla3RowModel = Listmohalla3RowModel()
    // TODO uncomment following line after integration with data source
    // val listmohalla3RowModel = list[position]
    holder.binding.listmohalla3RowModel = listmohalla3RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listmohalla3RowModel>) {
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
      item: Listmohalla3RowModel
    ) {
    }
  }

  inner class RowListmohalla3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmohalla3Binding = RowListmohalla3Binding.bind(itemView)
  }
}
