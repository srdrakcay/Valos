package com.serdar.presentation.map

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.serdar.common.extension.loadUrl
import com.serdar.presentation.databinding.MapsItemBinding
import com.serdar.presentation.weapon.WeaponsUiData


class MapsAdapter(private var mapsUiData:List<MapsUiData>) :
    RecyclerView.Adapter<MapsAdapter.MyViewHolder>() {


    inner class MyViewHolder(private val viewBinding: MapsItemBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        fun bindItems(mapsUiData: MapsUiData) {
            viewBinding.imageView.loadUrl(mapsUiData.displayIcon)
            viewBinding.textView.text=mapsUiData.displayName
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): MyViewHolder {
        val binding =
            MapsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindItems(mapsUiData[position])

    }

    override fun getItemCount(): Int {
        return mapsUiData.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateData(mapsUiData: List<MapsUiData>) {
        this.mapsUiData = mapsUiData
        notifyDataSetChanged()

    }
}