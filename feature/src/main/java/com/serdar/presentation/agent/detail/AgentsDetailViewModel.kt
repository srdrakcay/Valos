package com.serdar.presentation.agent.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.serdar.common.entity.ValorantAgentsDetailEntity
import com.serdar.common.entity.ValorantAgentsEntity
import com.serdar.common.mapper.ValorantListMapper
import com.serdar.data.NetworkResponseState
import com.serdar.domain.usecase.agentsusecase.agentsdetailusecase.AgentsDetailUseCase
import com.serdar.domain.usecase.agentsusecase.getagentsusecase.GetAgentsUseCase
import com.serdar.domain.usecase.favoritesusecase.additemusecase.AddItemFavoriteUseCase
import com.serdar.presentation.R
import com.serdar.presentation.agent.AgentsUiData
import com.serdar.presentation.agent.AgentsUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AgentsDetailViewModel@Inject constructor(
    private val agentsDetailUseCase: AgentsDetailUseCase,
    private val valorantUiDetailMapper: ValorantListMapper<ValorantAgentsDetailEntity, AgentsDetailData>,
)  : ViewModel() {


    private val _valorantAgentsDetailUiState = MutableLiveData<AgentsDetailState>()
    val valorantAgentsDetailUiState: LiveData<AgentsDetailState> get() = _valorantAgentsDetailUiState

    fun getAgentsDetail(uuid:String) {
        viewModelScope.launch {
            agentsDetailUseCase(uuid).collectLatest {
                when (it) {
                    is NetworkResponseState.Error -> {
                        _valorantAgentsDetailUiState.postValue(AgentsDetailState.Error(R.string.error))
                    }
                    NetworkResponseState.Loading -> {
                        _valorantAgentsDetailUiState.postValue(AgentsDetailState.Loading)
                    }
                    is NetworkResponseState.Success -> {
                        _valorantAgentsDetailUiState.postValue(AgentsDetailState.Success(valorantUiDetailMapper.map(it.result)))
                    }
                }
            }
        }
    }
}