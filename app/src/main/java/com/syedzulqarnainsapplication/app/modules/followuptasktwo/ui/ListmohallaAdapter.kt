package com.syedzulqarnainsapplication.app.modules.followuptasktwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowListmohallaBinding
import com.syedzulqarnainsapplication.app.modules.followuptasktwo.`data`.model.ListmohallaRowModel
import kotlin.Int
import kotlin.collections.List

class ListmohallaAdapter(
  var list: List<ListmohallaRowModel>
) : RecyclerView.Adapter<ListmohallaAdapter.RowListmohallaVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmohallaVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmohalla,parent,false)
    return RowListmohallaVH(view)
  }

  override fun onBindViewHolder(holder: RowListmohallaVH, position: Int) {
    val listmohallaRowModel = ListmohallaRowModel()
    // TODO uncomment following line after integration with data source
    // val listmohallaRowModel = list[position]
    holder.binding.listmohallaRowModel = listmohallaRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListmohallaRowModel>) {
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
      item: ListmohallaRowModel
    ) {
    }
  }

  inner class RowListmohallaVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmohallaBinding = RowListmohallaBinding.bind(itemView)
  }
}
