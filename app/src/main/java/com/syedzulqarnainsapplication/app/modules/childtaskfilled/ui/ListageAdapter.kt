package com.syedzulqarnainsapplication.app.modules.childtaskfilled.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowListage3Binding
import com.syedzulqarnainsapplication.app.modules.childtaskfilled.`data`.model.Listage3RowModel
import kotlin.Int
import kotlin.collections.List

class ListageAdapter(
  var list: List<Listage3RowModel>
) : RecyclerView.Adapter<ListageAdapter.RowListage3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListage3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listage3,parent,false)
    return RowListage3VH(view)
  }

  override fun onBindViewHolder(holder: RowListage3VH, position: Int) {
    val listage3RowModel = Listage3RowModel()
    // TODO uncomment following line after integration with data source
    // val listage3RowModel = list[position]
    holder.binding.listage3RowModel = listage3RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listage3RowModel>) {
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
      item: Listage3RowModel
    ) {
    }
  }

  inner class RowListage3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListage3Binding = RowListage3Binding.bind(itemView)
  }
}
