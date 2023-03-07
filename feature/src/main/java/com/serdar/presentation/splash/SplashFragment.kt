package com.serdar.presentation.splash

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.serdar.common.binding.viewBinding
import com.serdar.presentation.R

import com.serdar.presentation.databinding.FragmentSplashBinding

class SplashFragment : Fragment(R.layout.fragment_splash) {
    private val binding by viewBinding(FragmentSplashBinding::bind)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        delay()
    }
    private fun delay() {
        val timer = object : CountDownTimer(3000, 50) {
            override fun onTick(p0: Long) {
            }

            override fun onFinish() {

                findNavController().navigate(com.serdar.navigation.R.id.actionToHome)
            }

        }
        timer.start()
    }
}