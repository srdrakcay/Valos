package com.serdar.presentation.weapon

import androidx.annotation.StringRes

sealed class WeaponsUiState {
    object Loading : WeaponsUiState()
    data class Success(val data: List<WeaponsUiData>) : WeaponsUiState()
    data class Error(@StringRes val message: Int) : WeaponsUiState()

}