package com.serdar.presentation.agent.detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.serdar.common.binding.viewBinding
import com.serdar.common.extension.loadUrl
import com.serdar.presentation.R
import com.serdar.presentation.databinding.FragmentAgentsDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AgentsDetailFragment : Fragment(R.layout.fragment_agents_detail) {
    private val binding by viewBinding(FragmentAgentsDetailBinding::bind)
    private val viewModel: AgentsDetailViewModel by viewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        uiState()
        viewModel.getAgentsDetail("dade69b4-4f5a-8528-247b-219e5a1facd6")
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
                    binding.image.loadUrl(it.data[0].fullPortraitV2)
                    binding.desc.text=it.data[0].description
                    binding.name.text=it.data[0].assetPath
                    binding.imageView3.loadUrl(it.data[0].bustPortrait)
                }
            }
        }
    }
}
