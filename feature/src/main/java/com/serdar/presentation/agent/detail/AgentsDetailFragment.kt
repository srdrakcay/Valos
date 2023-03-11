package com.serdar.presentation.agent.detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.serdar.common.binding.viewBinding
import com.serdar.common.extension.loadUrl
import com.serdar.presentation.R
import com.serdar.presentation.databinding.FragmentAgentsDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AgentsDetailFragment : Fragment(R.layout.fragment_agents_detail) {
    private val binding by viewBinding(FragmentAgentsDetailBinding::bind)
    private val viewModel: AgentsDetailViewModel by viewModels()
    private val args:AgentsDetailFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        agentsWithUuid()
        uiState()

    }
    private fun uiState() {
        viewModel.valorantAgentsDetailUiState.observe(viewLifecycleOwner) {
            when (it) {
                is AgentsDetailState.Loading -> {
                    //do something

                    println("data Loading")
                }
                is AgentsDetailState.Error -> {
                    //do something
                    println("data error")
                }
                is AgentsDetailState.Success -> {
                    dataSet(it.data)
                }
            }
        }
    }
    private fun dataSet(agentsDetailData:List< AgentsDetailData>){
        binding.image.loadUrl(agentsDetailData[0].fullPortraitV2)
        binding.desc.text=agentsDetailData[0].description
        binding.name.text=agentsDetailData[0].assetPath
        binding.imageView3.loadUrl(agentsDetailData[0].bustPortrait)

    }
    private fun agentsWithUuid(){
        viewModel.getAgentsDetail(args.uuid)
    }
}
