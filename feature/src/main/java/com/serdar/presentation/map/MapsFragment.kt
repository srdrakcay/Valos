package com.serdar.presentation.map

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.serdar.common.binding.viewBinding
import com.serdar.presentation.R
import com.serdar.presentation.agent.AgentsFragmentDirections
import com.serdar.presentation.databinding.FragmentMapsBinding
import com.serdar.presentation.map.detail.MapsDetailFragmentDirections
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MapsFragment : Fragment(R.layout.fragment_maps) {
    private val viewModel: MapsViewModel by viewModels()
    private val binding by viewBinding(FragmentMapsBinding::bind)
    private val mapsAdapter by lazy {
        MapsAdapter(emptyList())
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        uiState()
    }

    private fun uiState() {
        viewModel.valorantMapsUiState.observe(viewLifecycleOwner) {
            when (it) {
                is MapsUiState.Loading -> {
                    //do something

                    println("data Loading")
                }
                is MapsUiState.Error -> {
                    //do something
                    println("data error")
                }
                is MapsUiState.Success -> {
                    binding.rcView.adapter = mapsAdapter
                    mapsAdapter.updateData(it.data)
                    mapsAdapter.onItemClick = {  data ->
                        val action =
                            MapsFragmentDirections.actionMapsFragmentToMapsDetailFragment(data)
                        findNavController().navigate(action)
                    }
                }
            }
        }
    }
}