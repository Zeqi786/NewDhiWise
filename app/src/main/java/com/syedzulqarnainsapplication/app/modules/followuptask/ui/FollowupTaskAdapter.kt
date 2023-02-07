package com.syedzulqarnainsapplication.app.modules.followuptask.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syedzulqarnainsapplication.app.R
import com.syedzulqarnainsapplication.app.databinding.RowFollowUpTaskBinding
import com.syedzulqarnainsapplication.app.modules.followuptask.`data`.model.FollowUpTaskRowModel
import kotlin.Int
import kotlin.collections.List

class FollowupTaskAdapter(
  var list: List<FollowUpTaskRowModel>
) : RecyclerView.Adapter<FollowupTaskAdapter.RowFollowUpTaskVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFollowUpTaskVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_follow_up_task,parent,false)
    return RowFollowUpTaskVH(view)
  }

  override fun onBindViewHolder(holder: RowFollowUpTaskVH, position: Int) {
    val followUpTaskRowModel = FollowUpTaskRowModel()
    // TODO uncomment following line after integration with data source
    // val followUpTaskRowModel = list[position]
    holder.binding.followUpTaskRowModel = followUpTaskRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<FollowUpTaskRowModel>) {
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
      item: FollowUpTaskRowModel
    ) {
    }
  }

  inner class RowFollowUpTaskVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowFollowUpTaskBinding = RowFollowUpTaskBinding.bind(itemView)
  }
}
