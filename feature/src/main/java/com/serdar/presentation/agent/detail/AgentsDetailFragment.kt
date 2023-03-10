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
        viewModel.getAgentsDetail("e370fa57-4757-3604-3648-499e1f642d3f")
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
                    binding.imageView2.loadUrl(it.data[0].displayIcon)
                    binding.textView2.text=it.data[0].description
                }
            }
        }
    }
}
