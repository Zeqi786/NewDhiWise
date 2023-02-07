package com.syedzulqarnainsapplication.app.modules.childprofile.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowListage5Binding
import com.syedzulqarnainsapplication.app.modules.childprofile.`data`.model.Listage5RowModel
import kotlin.Int
import kotlin.collections.List

class ListageAdapter(
  var list: List<Listage5RowModel>
) : RecyclerView.Adapter<ListageAdapter.RowListage5VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListage5VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listage5,parent,false)
    return RowListage5VH(view)
  }

  override fun onBindViewHolder(holder: RowListage5VH, position: Int) {
    val listage5RowModel = Listage5RowModel()
    // TODO uncomment following line after integration with data source
    // val listage5RowModel = list[position]
    holder.binding.listage5RowModel = listage5RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listage5RowModel>) {
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
      item: Listage5RowModel
    ) {
    }
  }

  inner class RowListage5VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListage5Binding = RowListage5Binding.bind(itemView)
  }
}
