package com.syedzulqarnainsapplication.app.modules.childtaskfocused.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowListmothername1Binding
import com.syedzulqarnainsapplication.app.modules.childtaskfocused.`data`.model.Listmothername1RowModel
import kotlin.Int
import kotlin.collections.List

class ListmothernameAdapter(
  var list: List<Listmothername1RowModel>
) : RecyclerView.Adapter<ListmothernameAdapter.RowListmothername1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmothername1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmothername1,parent,false)
    return RowListmothername1VH(view)
  }

  override fun onBindViewHolder(holder: RowListmothername1VH, position: Int) {
    val listmothername1RowModel = Listmothername1RowModel()
    // TODO uncomment following line after integration with data source
    // val listmothername1RowModel = list[position]
    holder.binding.listmothername1RowModel = listmothername1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listmothername1RowModel>) {
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
      item: Listmothername1RowModel
    ) {
    }
  }

  inner class RowListmothername1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmothername1Binding = RowListmothername1Binding.bind(itemView)
  }
}
