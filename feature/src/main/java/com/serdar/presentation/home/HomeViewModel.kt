package com.serdar.presentation.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.serdar.common.entity.ValorantEntity
import com.serdar.common.mapper.ValorantListMapper
import com.serdar.data.NetworkResponseState
import com.serdar.domain.usecase.getagentsusecase.GetAgentsUseCase
import com.serdar.presentation.R
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel  @Inject constructor(
    private val getAgentsUseCase: GetAgentsUseCase,
    private val valorantUiMapper: ValorantListMapper<ValorantEntity, HomeUiData>
) : ViewModel() {

    private val _valorantHomeUiState = MutableLiveData<HomeUiState>()
    val valorantHomeUiState: LiveData<HomeUiState> get() = _valorantHomeUiState

    init {
        getWeapons()
    }
    private fun getWeapons() {
        viewModelScope.launch {
            getAgentsUseCase().collectLatest{
                when (it) {
                    is NetworkResponseState.Error -> {
                        _valorantHomeUiState.postValue(HomeUiState.Error(R.string.error))
                    }
                    NetworkResponseState.Loading -> {
                        _valorantHomeUiState.postValue(HomeUiState.Loading)
                    }
                    is NetworkResponseState.Success -> {
                        _valorantHomeUiState.postValue(HomeUiState.Success(valorantUiMapper.map(it.result)))
                    }
                }
            }
        }
    }
}