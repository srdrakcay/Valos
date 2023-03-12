package com.serdar.presentation.favorite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.serdar.common.binding.viewBinding
import com.serdar.presentation.R
import com.serdar.presentation.agent.AgentsAdapter
import com.serdar.presentation.agent.AgentsViewModel
import com.serdar.presentation.databinding.FragmentAgentsBinding
import com.serdar.presentation.databinding.FragmentFavoriteBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FavoriteFragment : Fragment(R.layout.fragment_favorite) {
    private val viewModel: FavoriteViewModel by viewModels()
    private val binding by viewBinding(FragmentFavoriteBinding::bind)
    private val favoriteAdapter by lazy {
        FavoriteAdapter(emptyList())
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        readAllData()
        deleteItem()
    }
    private fun readAllData() {
        viewModel.favoriteUiList.observe(viewLifecycleOwner) {
            binding.recyclerView.adapter = favoriteAdapter
            favoriteAdapter.updateData(it)
        }
    }
    private fun deleteItem(){
        viewModel.favoriteUiList.observe(viewLifecycleOwner) {data->
        favoriteAdapter.onItemClick={
            viewModel.deleteFavoriteItemFromDatabase(data[0])
        }
    }
    }

}