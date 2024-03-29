package com.serdar.presentation.agent

import androidx.annotation.StringRes

sealed class AgentsUiState {
    object Loading : AgentsUiState()
    data class Success(val data: List<AgentsUiData>) : AgentsUiState()
    data class Error(@StringRes val message: Int) : AgentsUiState()

}