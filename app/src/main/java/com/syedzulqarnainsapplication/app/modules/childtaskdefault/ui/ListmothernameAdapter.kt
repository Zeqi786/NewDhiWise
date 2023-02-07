package com.syedzulqarnainsapplication.app.modules.childtaskdefault.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowListmothernameBinding
import com.syedzulqarnainsapplication.app.modules.childtaskdefault.`data`.model.ListmothernameRowModel
import kotlin.Int
import kotlin.collections.List

class ListmothernameAdapter(
  var list: List<ListmothernameRowModel>
) : RecyclerView.Adapter<ListmothernameAdapter.RowListmothernameVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmothernameVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmothername,parent,false)
    return RowListmothernameVH(view)
  }

  override fun onBindViewHolder(holder: RowListmothernameVH, position: Int) {
    val listmothernameRowModel = ListmothernameRowModel()
    // TODO uncomment following line after integration with data source
    // val listmothernameRowModel = list[position]
    holder.binding.listmothernameRowModel = listmothernameRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListmothernameRowModel>) {
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
      item: ListmothernameRowModel
    ) {
    }
  }

  inner class RowListmothernameVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmothernameBinding = RowListmothernameBinding.bind(itemView)
  }
}
