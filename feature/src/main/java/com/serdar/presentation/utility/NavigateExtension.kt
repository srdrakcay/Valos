package com.serdar.presentation.utility

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

fun Fragment.moveTo(destination:Int){
    findNavController().navigate(destination)

}