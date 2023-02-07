package com.syedzulqarnainsapplication.app.modules.childprofile.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowListbcgBinding
import com.syedzulqarnainsapplication.app.modules.childprofile.`data`.model.ListbcgRowModel
import kotlin.Int
import kotlin.collections.List

class ListbcgAdapter(
  var list: List<ListbcgRowModel>
) : RecyclerView.Adapter<ListbcgAdapter.RowListbcgVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbcgVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbcg,parent,false)
    return RowListbcgVH(view)
  }

  override fun onBindViewHolder(holder: RowListbcgVH, position: Int) {
    val listbcgRowModel = ListbcgRowModel()
    // TODO uncomment following line after integration with data source
    // val listbcgRowModel = list[position]
    holder.binding.listbcgRowModel = listbcgRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListbcgRowModel>) {
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
      item: ListbcgRowModel
    ) {
    }
  }

  inner class RowListbcgVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbcgBinding = RowListbcgBinding.bind(itemView)
  }
}
