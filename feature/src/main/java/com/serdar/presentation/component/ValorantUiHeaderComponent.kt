package com.serdar.presentation.component

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.serdar.presentation.databinding.HeaderLayoutBinding

class ValorantUiHeaderComponent @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet,
    defStyleAttr: Int = 0
) :
    FrameLayout(context, attributeSet, defStyleAttr) {


    private val _binding = HeaderLayoutBinding.inflate(LayoutInflater.from(context), this, false)

    init {
        addView(_binding.root)

    }
    fun setLayout(onItemClick:()->Unit,title:String){
        _binding.title.text=title
        _binding.arrowBack.setOnClickListener {
            onItemClick.invoke()
        }
    }
}