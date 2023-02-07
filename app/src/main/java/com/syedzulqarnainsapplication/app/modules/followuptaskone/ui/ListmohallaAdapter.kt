package com.syedzulqarnainsapplication.app.modules.followuptaskone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowListmohalla1Binding
import com.syedzulqarnainsapplication.app.modules.followuptaskone.`data`.model.Listmohalla1RowModel
import kotlin.Int
import kotlin.collections.List

class ListmohallaAdapter(
  var list: List<Listmohalla1RowModel>
) : RecyclerView.Adapter<ListmohallaAdapter.RowListmohalla1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmohalla1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmohalla1,parent,false)
    return RowListmohalla1VH(view)
  }

  override fun onBindViewHolder(holder: RowListmohalla1VH, position: Int) {
    val listmohalla1RowModel = Listmohalla1RowModel()
    // TODO uncomment following line after integration with data source
    // val listmohalla1RowModel = list[position]
    holder.binding.listmohalla1RowModel = listmohalla1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listmohalla1RowModel>) {
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
      item: Listmohalla1RowModel
    ) {
    }
  }

  inner class RowListmohalla1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmohalla1Binding = RowListmohalla1Binding.bind(itemView)
  }
}
