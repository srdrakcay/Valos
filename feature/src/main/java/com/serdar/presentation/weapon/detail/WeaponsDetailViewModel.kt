package com.serdar.presentation.weapon.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.serdar.common.entity.ValorantWeaponsDetailEntity
import com.serdar.common.mapper.ValorantListMapper
import com.serdar.data.NetworkResponseState
import com.serdar.data.dto.favorite.FavoritesDataModel
import com.serdar.domain.usecase.favoritesusecase.additemusecase.AddItemFavoriteUseCase
import com.serdar.domain.usecase.weaponsusecase.weaponsdetailusecase.WeaponsDetailUseCase
import com.serdar.presentation.R
import com.serdar.presentation.weapon.WeaponsUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeaponsDetailViewModel @Inject constructor(
    private val weaponsDetailUseCase: WeaponsDetailUseCase,
    private val addItemFavoriteUseCase: AddItemFavoriteUseCase,
    private val valorantWeaponsDetailMapper:ValorantListMapper<ValorantWeaponsDetailEntity,WeaponsDetailData>
): ViewModel() {

    private val _valorantWeaponsDetailState = MutableLiveData<WeaponsDetailState>()
    val valorantWeaponsDetailState: LiveData<WeaponsDetailState> get() = _valorantWeaponsDetailState


     fun getWeaponsDetail(uuid:String) {
        viewModelScope.launch {
            weaponsDetailUseCase(uuid).collectLatest {
                when (it) {
                    is NetworkResponseState.Error -> {
                        _valorantWeaponsDetailState.postValue(WeaponsDetailState.Error(R.string.error))
                    }
                    NetworkResponseState.Loading -> {
                        _valorantWeaponsDetailState.postValue(WeaponsDetailState.Loading)
                    }
                    is NetworkResponseState.Success -> {
                        _valorantWeaponsDetailState.postValue(WeaponsDetailState.Success(
                                valorantWeaponsDetailMapper.map(it.result)
                            )
                        )
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