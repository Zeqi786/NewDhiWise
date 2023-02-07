package com.syedzulqarnainsapplication.app.modules.childtaskfilled.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowListmothername3Binding
import com.syedzulqarnainsapplication.app.modules.childtaskfilled.`data`.model.Listmothername3RowModel
import kotlin.Int
import kotlin.collections.List

class ListmothernameAdapter(
  var list: List<Listmothername3RowModel>
) : RecyclerView.Adapter<ListmothernameAdapter.RowListmothername3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmothername3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmothername3,parent,false)
    return RowListmothername3VH(view)
  }

  override fun onBindViewHolder(holder: RowListmothername3VH, position: Int) {
    val listmothername3RowModel = Listmothername3RowModel()
    // TODO uncomment following line after integration with data source
    // val listmothername3RowModel = list[position]
    holder.binding.listmothername3RowModel = listmothername3RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listmothername3RowModel>) {
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
      item: Listmothername3RowModel
    ) {
    }
  }

  inner class RowListmothername3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmothername3Binding = RowListmothername3Binding.bind(itemView)
  }
}
