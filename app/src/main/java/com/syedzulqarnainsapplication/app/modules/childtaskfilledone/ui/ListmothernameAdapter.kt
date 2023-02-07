package com.syedzulqarnainsapplication.app.modules.childtaskfilledone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowListmothername4Binding
import com.syedzulqarnainsapplication.app.modules.childtaskfilledone.`data`.model.Listmothername4RowModel
import kotlin.Int
import kotlin.collections.List

class ListmothernameAdapter(
  var list: List<Listmothername4RowModel>
) : RecyclerView.Adapter<ListmothernameAdapter.RowListmothername4VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmothername4VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmothername4,parent,false)
    return RowListmothername4VH(view)
  }

  override fun onBindViewHolder(holder: RowListmothername4VH, position: Int) {
    val listmothername4RowModel = Listmothername4RowModel()
    // TODO uncomment following line after integration with data source
    // val listmothername4RowModel = list[position]
    holder.binding.listmothername4RowModel = listmothername4RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listmothername4RowModel>) {
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
      item: Listmothername4RowModel
    ) {
    }
  }

  inner class RowListmothername4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmothername4Binding = RowListmothername4Binding.bind(itemView)
  }
}
