package com.serdar.presentation.map.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.serdar.common.entity.ValorantMapsDetailEntity
import com.serdar.common.mapper.ValorantListMapper
import com.serdar.data.NetworkResponseState
import com.serdar.domain.usecase.mapsusecase.mapsdetailusecase.MapsDetailUseCase
import com.serdar.presentation.R
import com.serdar.presentation.agent.detail.AgentsDetailState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MapsDetailViewModel @Inject constructor(
    private val mapsDetailUseCase: MapsDetailUseCase,
    private val valorantUiDetailMapper: ValorantListMapper<ValorantMapsDetailEntity, MapsDetailData>,
) : ViewModel() {


    private val _valorantMapsDetailUiState = MutableLiveData<MapsDetailState>()
    val valorantMapsDetailUiState: LiveData<MapsDetailState> get() = _valorantMapsDetailUiState


    fun getMapsDetail(uuid:String) {
        viewModelScope.launch {
            mapsDetailUseCase(uuid).collectLatest {
                when (it) {
                    is NetworkResponseState.Error -> {
                        _valorantMapsDetailUiState.postValue(MapsDetailState.Error(R.string.error))
                    }
                    NetworkResponseState.Loading -> {
                        _valorantMapsDetailUiState.postValue(MapsDetailState.Loading)
                    }
                    is NetworkResponseState.Success -> {
                        _valorantMapsDetailUiState.postValue(MapsDetailState.Success(valorantUiDetailMapper.map(it.result)))
                    }
                }
            }
        }
    }
}