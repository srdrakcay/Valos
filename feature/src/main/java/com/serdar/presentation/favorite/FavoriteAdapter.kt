package com.serdar.presentation.favorite

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.serdar.common.extension.loadUrl
import com.serdar.data.dto.favorite.FavoritesDataModel
import com.serdar.presentation.databinding.AgentItemBinding
import com.serdar.presentation.databinding.FavoriteItemBinding


class FavoriteAdapter(
    private var favoritesDataModel: List<FavoritesDataModel>,
    var onItemClick: (() -> Unit)? = null
) :
    RecyclerView.Adapter<FavoriteAdapter.MyViewHolder>() {


    inner class MyViewHolder(private val viewBinding: FavoriteItemBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        fun bindItems(favoritesDataModel: FavoritesDataModel) {
            viewBinding.imageView.loadUrl(favoritesDataModel.name)
            viewBinding.textView.text=favoritesDataModel.image

        }
        val deleteFavoriteItem= viewBinding.deleteFavorite
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): MyViewHolder {
        val binding =
            FavoriteItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindItems(favoritesDataModel[position])
        holder.deleteFavoriteItem.setOnClickListener {
            onItemClick?.invoke()
        }


    }

    override fun getItemCount(): Int {
        return favoritesDataModel.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateData(favoritesDataModel: List<FavoritesDataModel>) {
        this.favoritesDataModel = favoritesDataModel
        notifyDataSetChanged()

    }
}