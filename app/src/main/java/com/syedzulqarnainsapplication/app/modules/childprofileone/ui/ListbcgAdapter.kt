package com.syedzulqarnainsapplication.app.modules.childprofileone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowListbcg1Binding
import com.syedzulqarnainsapplication.app.modules.childprofileone.`data`.model.Listbcg1RowModel
import kotlin.Int
import kotlin.collections.List

class ListbcgAdapter(
  var list: List<Listbcg1RowModel>
) : RecyclerView.Adapter<ListbcgAdapter.RowListbcg1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbcg1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbcg1,parent,false)
    return RowListbcg1VH(view)
  }

  override fun onBindViewHolder(holder: RowListbcg1VH, position: Int) {
    val listbcg1RowModel = Listbcg1RowModel()
    // TODO uncomment following line after integration with data source
    // val listbcg1RowModel = list[position]
    holder.binding.listbcg1RowModel = listbcg1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listbcg1RowModel>) {
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
      item: Listbcg1RowModel
    ) {
    }
  }

  inner class RowListbcg1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbcg1Binding = RowListbcg1Binding.bind(itemView)
  }
}
