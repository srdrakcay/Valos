package com.serdar.presentation.weapon

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.serdar.common.entity.ValorantWeaponsEntity
import com.serdar.common.mapper.ValorantListMapper
import com.serdar.data.NetworkResponseState
import com.serdar.domain.usecase.getweaponsusecase.GetWeaponsUseCase
import com.serdar.presentation.R
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeaponsViewModel @Inject constructor(
    private val getWeaponsUseCase: GetWeaponsUseCase,
    private val valorantUiWeaponsMapper: ValorantListMapper<ValorantWeaponsEntity, WeaponsUiData>
) : ViewModel() {


    private val _valorantWeaponsUiState = MutableLiveData<WeaponsUiState>()
    val valorantWeaponsUiState: LiveData<WeaponsUiState> get() = _valorantWeaponsUiState

    init {
        getWeapons()
    }

    private fun getWeapons() {
        viewModelScope.launch {
            getWeaponsUseCase().collectLatest {
                when (it) {
                    is NetworkResponseState.Error -> {
                        _valorantWeaponsUiState.postValue(WeaponsUiState.Error(R.string.error))
                    }
                    NetworkResponseState.Loading -> {
                        _valorantWeaponsUiState.postValue(WeaponsUiState.Loading)
                    }
                    is NetworkResponseState.Success -> {
                        _valorantWeaponsUiState.postValue(
                            WeaponsUiState.Success(
                                valorantUiWeaponsMapper.map(it.result)
                            )
                        )
                    }
                }
            }
        }
    }
}