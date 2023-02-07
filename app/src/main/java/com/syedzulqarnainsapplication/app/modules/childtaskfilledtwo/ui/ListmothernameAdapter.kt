package com.syedzulqarnainsapplication.app.modules.childtaskfilledtwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowListmothername2Binding
import com.syedzulqarnainsapplication.app.modules.childtaskfilledtwo.`data`.model.Listmothername2RowModel
import kotlin.Int
import kotlin.collections.List

class ListmothernameAdapter(
  var list: List<Listmothername2RowModel>
) : RecyclerView.Adapter<ListmothernameAdapter.RowListmothername2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmothername2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmothername2,parent,false)
    return RowListmothername2VH(view)
  }

  override fun onBindViewHolder(holder: RowListmothername2VH, position: Int) {
    val listmothername2RowModel = Listmothername2RowModel()
    // TODO uncomment following line after integration with data source
    // val listmothername2RowModel = list[position]
    holder.binding.listmothername2RowModel = listmothername2RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listmothername2RowModel>) {
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
      item: Listmothername2RowModel
    ) {
    }
  }

  inner class RowListmothername2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmothername2Binding = RowListmothername2Binding.bind(itemView)
  }
}
