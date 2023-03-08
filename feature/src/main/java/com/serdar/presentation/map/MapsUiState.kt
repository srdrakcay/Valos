package com.serdar.presentation.map

import androidx.annotation.StringRes


sealed class MapsUiState {
    object Loading : MapsUiState()
    data class Success(val data: List<MapsUiData>) : MapsUiState()
    data class Error(@StringRes val message: Int) : MapsUiState()

}