package com.serdar.presentation.weapon

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.serdar.common.extension.loadUrl
import com.serdar.presentation.databinding.WeaponsItemBinding

class WeaponsAdapter(private var weaponsUiData: List<WeaponsUiData>
,var onItemClick: ((uuid:String) -> Unit)? = null) :
    RecyclerView.Adapter<WeaponsAdapter.MyViewHolder>() {


    inner class MyViewHolder(private val viewBinding: WeaponsItemBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        fun bindItems(weaponsUiData: WeaponsUiData) {
            viewBinding.imageView.loadUrl(weaponsUiData.killStreamIcon)
            viewBinding.textView.text=weaponsUiData.assetPath
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): MyViewHolder {
        val binding =
            WeaponsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindItems(weaponsUiData[position])
        holder.itemView.setOnClickListener {
            onItemClick?.invoke(weaponsUiData[position].uuid)
        }

    }

    override fun getItemCount(): Int {
        return weaponsUiData.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateData(weaponsUiData: List<WeaponsUiData>) {
        this.weaponsUiData = weaponsUiData
        notifyDataSetChanged()

    }
}