package com.serdar.presentation.map.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.serdar.common.binding.viewBinding
import com.serdar.common.extension.loadUrl
import com.serdar.presentation.R
import com.serdar.presentation.agent.detail.AgentsDetailData
import com.serdar.presentation.agent.detail.AgentsDetailFragmentArgs
import com.serdar.presentation.databinding.FragmentMapsBinding
import com.serdar.presentation.databinding.FragmentMapsDetailBinding
import com.serdar.presentation.map.MapsUiState
import com.serdar.presentation.map.MapsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MapsDetailFragment : Fragment(R.layout.fragment_maps_detail) {
    private val viewModel: MapsDetailViewModel by viewModels()
    private val binding by viewBinding(FragmentMapsDetailBinding::bind)
    private val args: MapsDetailFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        uiState()
        setData()
    }
    private fun uiState() {
        viewModel.valorantMapsDetailUiState.observe(viewLifecycleOwner) {
            when (it) {
                is MapsDetailState.Loading -> {
                    //do something

                    println("data Loading")
                }
                is MapsDetailState.Error -> {
                    //do something
                    println("data error")
                }
                is MapsDetailState.Success -> {
                    dataSet(it.data)
                    }
                }
            }
        }
    private fun dataSet(mapsDetailData:List<MapsDetailData>){
        binding.image.loadUrl(mapsDetailData[0].displayIcon)
        binding.desc.text=mapsDetailData[0].coordinates
        binding.name.text=mapsDetailData[0].displayName
        binding.imageView3.loadUrl(mapsDetailData[0].splash)

    }
    private fun setData(){
        viewModel.getMapsDetail(args.uuid)
    }
}