package com.serdar.presentation.home

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.serdar.common.extension.loadUrl
import com.serdar.presentation.databinding.AgentItemBinding

class HomeAdapter(private var homeUiData: List<HomeUiData>) :
    RecyclerView.Adapter<HomeAdapter.MyViewHolder>() {


    inner class MyViewHolder(private val viewBinding: AgentItemBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        fun bindItems(homeUiData: HomeUiData) {
            viewBinding.imageView.loadUrl(homeUiData.fullPortrait)
            viewBinding.textView.text = homeUiData.displayName
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): MyViewHolder {
        val binding =
            AgentItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindItems(homeUiData[position])

    }

    override fun getItemCount(): Int {
        return homeUiData.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateData(homeUiData: List<HomeUiData>) {
        this.homeUiData = homeUiData
        notifyDataSetChanged()

    }
}