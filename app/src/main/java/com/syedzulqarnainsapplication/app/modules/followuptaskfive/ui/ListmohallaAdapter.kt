package com.syedzulqarnainsapplication.app.modules.followuptaskfive.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowListmohalla5Binding
import com.syedzulqarnainsapplication.app.modules.followuptaskfive.`data`.model.Listmohalla5RowModel
import kotlin.Int
import kotlin.collections.List

class ListmohallaAdapter(
  var list: List<Listmohalla5RowModel>
) : RecyclerView.Adapter<ListmohallaAdapter.RowListmohalla5VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmohalla5VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmohalla5,parent,false)
    return RowListmohalla5VH(view)
  }

  override fun onBindViewHolder(holder: RowListmohalla5VH, position: Int) {
    val listmohalla5RowModel = Listmohalla5RowModel()
    // TODO uncomment following line after integration with data source
    // val listmohalla5RowModel = list[position]
    holder.binding.listmohalla5RowModel = listmohalla5RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listmohalla5RowModel>) {
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
      item: Listmohalla5RowModel
    ) {
    }
  }

  inner class RowListmohalla5VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmohalla5Binding = RowListmohalla5Binding.bind(itemView)
  }
}
