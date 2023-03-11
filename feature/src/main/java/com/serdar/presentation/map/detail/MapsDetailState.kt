package com.serdar.presentation.map.detail

import androidx.annotation.StringRes


sealed class MapsDetailState {
    object Loading : MapsDetailState()
    data class Success(val data: List<MapsDetailData>) : MapsDetailState()
    data class Error(@StringRes val message: Int) : MapsDetailState()
}