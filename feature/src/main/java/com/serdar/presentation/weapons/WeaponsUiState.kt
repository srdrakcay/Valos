package com.serdar.presentation.weapons

import androidx.annotation.StringRes
import com.serdar.presentation.agents.AgentsUiData

sealed class WeaponsUiState {
    object Loading : WeaponsUiState()
    data class Success(val data: List<WeaponsUiData>) : WeaponsUiState()
    data class Error(@StringRes val message: Int) : WeaponsUiState()

}