package com.syedzulqarnainsapplication.app.modules.structureprofileone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowListmohalla2Binding
import com.syedzulqarnainsapplication.app.modules.structureprofileone.`data`.model.Listmohalla2RowModel
import kotlin.Int
import kotlin.collections.List

class ListmohallaAdapter(
  var list: List<Listmohalla2RowModel>
) : RecyclerView.Adapter<ListmohallaAdapter.RowListmohalla2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmohalla2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmohalla2,parent,false)
    return RowListmohalla2VH(view)
  }

  override fun onBindViewHolder(holder: RowListmohalla2VH, position: Int) {
    val listmohalla2RowModel = Listmohalla2RowModel()
    // TODO uncomment following line after integration with data source
    // val listmohalla2RowModel = list[position]
    holder.binding.listmohalla2RowModel = listmohalla2RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listmohalla2RowModel>) {
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
      item: Listmohalla2RowModel
    ) {
    }
  }

  inner class RowListmohalla2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmohalla2Binding = RowListmohalla2Binding.bind(itemView)
  }
}
