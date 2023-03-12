package com.serdar.presentation.weapon.detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.serdar.common.binding.viewBinding
import com.serdar.common.extension.loadUrl
import com.serdar.presentation.R
import com.serdar.presentation.databinding.FragmentWeaponsDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WeaponsDetailFragment : Fragment(R.layout.fragment_weapons_detail) {
    private val viewModel: WeaponsDetailViewModel by viewModels()
    private val binding by viewBinding(FragmentWeaponsDetailBinding::bind)
    private val args: WeaponsDetailFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        uiState()
        setData()

    }

    private fun uiState() {
        viewModel.valorantWeaponsDetailState.observe(viewLifecycleOwner) {
            when (it) {
                is WeaponsDetailState.Loading -> {
                    //do something

                    println("data Loading")
                }
                is WeaponsDetailState.Error -> {
                    //do something
                    println("data error")
                }
                is WeaponsDetailState.Success -> {
                    dataSet(it.data)
                }
            }
        }
    }

    private fun dataSet(weaponsDetailData: List<WeaponsDetailData>) {
        binding.image.loadUrl(weaponsDetailData[0].displayIcon)
        binding.desc.text = weaponsDetailData[0].displayName
        binding.name.text = weaponsDetailData[0].assetPath
        binding.imageView3.loadUrl(weaponsDetailData[0].killStreamIcon)

    }

    private fun setData() {

        viewModel.getWeaponsDetail(args.uuid)
    }
}
