package com.serdar.presentation.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.serdar.common.binding.viewBinding
import com.serdar.presentation.R
import com.serdar.presentation.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {
    private val viewModel: HomeViewModel by viewModels()
    private val binding by viewBinding(FragmentHomeBinding::bind)
    private val homeAdapter by lazy {
        HomeAdapter(emptyList())
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        uiState()
    }

    private fun uiState() {
        viewModel.valorantHomeUiState.observe(viewLifecycleOwner) {
            when (it) {
                is HomeUiState.Loading -> {
                    //do something

                    println("data Loading")
                }
                is HomeUiState.Error -> {
                    //do something
                    println("data error")
                }
                is HomeUiState.Success -> {
                    binding.rcView.adapter = homeAdapter
                    homeAdapter.updateData(it.data)
                }
            }
        }
    }
}

