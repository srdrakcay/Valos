package com.serdar.presentation.agent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.serdar.common.binding.viewBinding
import com.serdar.presentation.R
import com.serdar.presentation.databinding.FragmentAgentsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AgentsFragment : Fragment(R.layout.fragment_agents) {
    private val viewModel: AgentsViewModel by viewModels()
    private val binding by viewBinding(FragmentAgentsBinding::bind)
    private val agentsAdapter by lazy {
        AgentsAdapter(emptyList())
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        uiState()
    }

    private fun uiState() {
        viewModel.valorantHomeUiState.observe(viewLifecycleOwner) {
            when (it) {
                is AgentsUiState.Loading -> {
                    //do something

                    println("data Loading")
                }
                is AgentsUiState.Error -> {
                    //do something
                    println("data error")
                }
                is AgentsUiState.Success -> {
                    binding.rcView.adapter = agentsAdapter
                    agentsAdapter.updateData(it.data)
                }
            }
        }
    }
}

