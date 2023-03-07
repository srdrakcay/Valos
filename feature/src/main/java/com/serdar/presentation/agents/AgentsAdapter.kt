package com.serdar.presentation.agents

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.serdar.common.extension.loadUrl
import com.serdar.presentation.databinding.AgentItemBinding

class AgentsAdapter(private var agentsUiData: List<AgentsUiData>) :
    RecyclerView.Adapter<AgentsAdapter.MyViewHolder>() {


    inner class MyViewHolder(private val viewBinding: AgentItemBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        fun bindItems(agentsUiData: AgentsUiData) {
            viewBinding.imageView.loadUrl(agentsUiData.fullPortrait)
            viewBinding.textView.text = agentsUiData.displayName
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
        holder.bindItems(agentsUiData[position])

    }

    override fun getItemCount(): Int {
        return agentsUiData.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateData(agentsUiData: List<AgentsUiData>) {
        this.agentsUiData = agentsUiData
        notifyDataSetChanged()

    }
}