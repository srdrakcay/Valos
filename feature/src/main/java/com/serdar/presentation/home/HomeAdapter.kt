package com.serdar.presentation.home

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.serdar.common.extension.loadUrl
import com.serdar.presentation.databinding.AgentItemBinding

class HomeAdapter(private val homeUiData: List<HomeUiData>) :
    RecyclerView.Adapter<HomeAdapter.MyViewHolder>() {


    inner class MyViewHolder(val viewDataBinding: AgentItemBinding) :
        RecyclerView.ViewHolder(viewDataBinding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): MyViewHolder {
        val binding =
            AgentItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = homeUiData[position]
        holder.viewDataBinding.imageView.loadUrl(data.fullPortrait)
    }

    override fun getItemCount(): Int {
        return homeUiData.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateData(homeUiData: List<HomeUiData>) {
        notifyDataSetChanged()
    }
}