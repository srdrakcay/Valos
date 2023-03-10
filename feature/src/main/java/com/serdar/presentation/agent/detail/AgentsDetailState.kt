package com.serdar.presentation.agent.detail

import androidx.annotation.StringRes

sealed class AgentsDetailState {
    object Loading : AgentsDetailState()
    data class Success(val data: List<AgentsDetailData>) : AgentsDetailState()
    data class Error(@StringRes val message: Int) : AgentsDetailState()
}