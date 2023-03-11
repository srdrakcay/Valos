package com.serdar.presentation.weapon.detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.serdar.common.binding.viewBinding
import com.serdar.presentation.R
import com.serdar.presentation.databinding.FragmentWeaponsDetailBinding

class WeaponsDetailFragment : Fragment(R.layout.fragment_weapons_detail) {
    private val viewModel: WeaponsDetailViewModel by viewModels()
    private val binding by viewBinding(FragmentWeaponsDetailBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}