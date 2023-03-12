package com.serdar.presentation.weapon

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.serdar.common.binding.viewBinding
import com.serdar.presentation.R
import com.serdar.presentation.databinding.FragmentWeaponsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WeaponsFragment : Fragment(R.layout.fragment_weapons) {
    private val viewModel: WeaponsViewModel by viewModels()
    private val binding by viewBinding(FragmentWeaponsBinding::bind)
    private val weaponsAdapter by lazy {
        WeaponsAdapter(emptyList())
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        uiState()
    }

    private fun uiState() {
        viewModel.valorantWeaponsUiState.observe(viewLifecycleOwner) {
            when (it) {
                is WeaponsUiState.Loading -> {
                    //do something
                    println("data Loading")
                }
                is WeaponsUiState.Error -> {
                    //do something
                    println("data error")
                }
                is WeaponsUiState.Success -> {
                    binding.rcView.adapter = weaponsAdapter
                    weaponsAdapter.updateData(it.data)
                    weaponsAdapter.onItemClick = { data ->
                        val action =
                            WeaponsFragmentDirections.actionWeaponsFragmentToWeaponsDetailFragment(
                                data
                            )
                        findNavController().navigate(action)
                    }


                }
            }
        }
    }

}