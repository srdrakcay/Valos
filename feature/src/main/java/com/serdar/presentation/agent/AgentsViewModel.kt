package com.serdar.presentation.agent

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.serdar.common.entity.ValorantAgentsEntity
import com.serdar.common.mapper.ValorantListMapper
import com.serdar.data.NetworkResponseState
import com.serdar.data.dto.favorite.FavoritesDataModel
import com.serdar.domain.usecase.favoritesusecase.additemusecase.AddItemFavoriteUseCase
import com.serdar.domain.usecase.agentsusecase.getagentsusecase.GetAgentsUseCase
import com.serdar.presentation.R
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AgentsViewModel @Inject constructor(
    private val getAgentsUseCase: GetAgentsUseCase,
    private val addItemFavoriteUseCase: AddItemFavoriteUseCase,
    private val valorantUiMapper: ValorantListMapper<ValorantAgentsEntity, AgentsUiData>,
) : ViewModel() {

    private val _valorantHomeUiState = MutableLiveData<AgentsUiState>()
    val valorantHomeUiState: LiveData<AgentsUiState> get() = _valorantHomeUiState

    init {
        getAgents()
    }

    private fun getAgents() {
        viewModelScope.launch {
            getAgentsUseCase().collectLatest {
                when (it) {
                    is NetworkResponseState.Error -> {
                        _valorantHomeUiState.postValue(AgentsUiState.Error(R.string.error))
                    }
                    NetworkResponseState.Loading -> {
                        _valorantHomeUiState.postValue(AgentsUiState.Loading)
                    }
                    is NetworkResponseState.Success -> {
                        _valorantHomeUiState.postValue(AgentsUiState.Success(valorantUiMapper.map(it.result)))
                    }
                }
            }
        }
    }

    fun addFavoriteItem(item: FavoritesDataModel) {
        viewModelScope.launch {
            addItemFavoriteUseCase(item)


        }
    }
}