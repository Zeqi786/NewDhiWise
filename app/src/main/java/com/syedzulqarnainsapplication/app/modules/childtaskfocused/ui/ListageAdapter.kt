package com.syedzulqarnainsapplication.app.modules.childtaskfocused.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowListage1Binding
import com.syedzulqarnainsapplication.app.modules.childtaskfocused.`data`.model.Listage1RowModel
import kotlin.Int
import kotlin.collections.List

class ListageAdapter(
  var list: List<Listage1RowModel>
) : RecyclerView.Adapter<ListageAdapter.RowListage1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListage1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listage1,parent,false)
    return RowListage1VH(view)
  }

  override fun onBindViewHolder(holder: RowListage1VH, position: Int) {
    val listage1RowModel = Listage1RowModel()
    // TODO uncomment following line after integration with data source
    // val listage1RowModel = list[position]
    holder.binding.listage1RowModel = listage1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listage1RowModel>) {
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
      item: Listage1RowModel
    ) {
    }
  }

  inner class RowListage1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListage1Binding = RowListage1Binding.bind(itemView)
  }
}
