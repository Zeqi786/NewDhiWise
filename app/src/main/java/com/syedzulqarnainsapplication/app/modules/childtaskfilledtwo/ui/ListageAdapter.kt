package com.syedzulqarnainsapplication.app.modules.childtaskfilledtwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowListage2Binding
import com.syedzulqarnainsapplication.app.modules.childtaskfilledtwo.`data`.model.Listage2RowModel
import kotlin.Int
import kotlin.collections.List

class ListageAdapter(
  var list: List<Listage2RowModel>
) : RecyclerView.Adapter<ListageAdapter.RowListage2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListage2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listage2,parent,false)
    return RowListage2VH(view)
  }

  override fun onBindViewHolder(holder: RowListage2VH, position: Int) {
    val listage2RowModel = Listage2RowModel()
    // TODO uncomment following line after integration with data source
    // val listage2RowModel = list[position]
    holder.binding.listage2RowModel = listage2RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listage2RowModel>) {
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
      item: Listage2RowModel
    ) {
    }
  }

  inner class RowListage2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListage2Binding = RowListage2Binding.bind(itemView)
  }
}
