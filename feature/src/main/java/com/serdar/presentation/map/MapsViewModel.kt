package com.serdar.presentation.map

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.serdar.common.entity.ValorantMapsEntity
import com.serdar.common.mapper.ValorantListMapper
import com.serdar.data.NetworkResponseState
import com.serdar.domain.usecase.getmapsusecase.GetMapsUseCase
import com.serdar.presentation.R
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MapsViewModel @Inject constructor(
    private val getMapsUseCase: GetMapsUseCase,
    private val valorantUiMapsMapper: ValorantListMapper<ValorantMapsEntity, MapsUiData>
) : ViewModel() {

    private val _valorantMapsUiState = MutableLiveData<MapsUiState>()
    val valorantMapsUiState: LiveData<MapsUiState> get() = _valorantMapsUiState

    init {
        getWeapons()
    }

    private fun getWeapons() {
        viewModelScope.launch {
            getMapsUseCase().collectLatest {
                when (it) {
                    is NetworkResponseState.Error -> {
                        _valorantMapsUiState.postValue(MapsUiState.Error(R.string.error))
                    }
                    NetworkResponseState.Loading -> {
                        _valorantMapsUiState.postValue(MapsUiState.Loading)
                    }
                    is NetworkResponseState.Success -> {
                        _valorantMapsUiState.postValue(
                            MapsUiState.Success(
                                valorantUiMapsMapper.map(it.result)
                            )
                        )
                    }
                }
            }
        }
    }

}