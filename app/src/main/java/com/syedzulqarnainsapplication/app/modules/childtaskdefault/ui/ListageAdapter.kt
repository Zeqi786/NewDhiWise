package com.syedzulqarnainsapplication.app.modules.childtaskdefault.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowListageBinding
import com.syedzulqarnainsapplication.app.modules.childtaskdefault.`data`.model.ListageRowModel
import kotlin.Int
import kotlin.collections.List

class ListageAdapter(
  var list: List<ListageRowModel>
) : RecyclerView.Adapter<ListageAdapter.RowListageVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListageVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listage,parent,false)
    return RowListageVH(view)
  }

  override fun onBindViewHolder(holder: RowListageVH, position: Int) {
    val listageRowModel = ListageRowModel()
    // TODO uncomment following line after integration with data source
    // val listageRowModel = list[position]
    holder.binding.listageRowModel = listageRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListageRowModel>) {
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
      item: ListageRowModel
    ) {
    }
  }

  inner class RowListageVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListageBinding = RowListageBinding.bind(itemView)
  }
}
