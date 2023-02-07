package com.syedzulqarnainsapplication.app.modules.childtaskfilledone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowListage4Binding
import com.syedzulqarnainsapplication.app.modules.childtaskfilledone.`data`.model.Listage4RowModel
import kotlin.Int
import kotlin.collections.List

class ListageAdapter(
  var list: List<Listage4RowModel>
) : RecyclerView.Adapter<ListageAdapter.RowListage4VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListage4VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listage4,parent,false)
    return RowListage4VH(view)
  }

  override fun onBindViewHolder(holder: RowListage4VH, position: Int) {
    val listage4RowModel = Listage4RowModel()
    // TODO uncomment following line after integration with data source
    // val listage4RowModel = list[position]
    holder.binding.listage4RowModel = listage4RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listage4RowModel>) {
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
      item: Listage4RowModel
    ) {
    }
  }

  inner class RowListage4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListage4Binding = RowListage4Binding.bind(itemView)
  }
}
