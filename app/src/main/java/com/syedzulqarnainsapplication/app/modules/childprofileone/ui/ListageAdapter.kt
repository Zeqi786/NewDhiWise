package com.syedzulqarnainsapplication.app.modules.childprofileone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowListage6Binding
import com.syedzulqarnainsapplication.app.modules.childprofileone.`data`.model.Listage6RowModel
import kotlin.Int
import kotlin.collections.List

class ListageAdapter(
  var list: List<Listage6RowModel>
) : RecyclerView.Adapter<ListageAdapter.RowListage6VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListage6VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listage6,parent,false)
    return RowListage6VH(view)
  }

  override fun onBindViewHolder(holder: RowListage6VH, position: Int) {
    val listage6RowModel = Listage6RowModel()
    // TODO uncomment following line after integration with data source
    // val listage6RowModel = list[position]
    holder.binding.listage6RowModel = listage6RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listage6RowModel>) {
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
      item: Listage6RowModel
    ) {
    }
  }

  inner class RowListage6VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListage6Binding = RowListage6Binding.bind(itemView)
  }
}
