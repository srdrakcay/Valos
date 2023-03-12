package com.serdar.common.extension

import android.graphics.Color
import android.view.WindowManager
import androidx.fragment.app.Fragment

fun Fragment.statusBar(color:String){
    requireActivity().window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
    requireActivity().window.statusBarColor = Color.parseColor(color)
}