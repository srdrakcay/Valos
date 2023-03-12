package com.serdar.presentation.favorite

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.serdar.data.dto.favorite.FavoritesDataModel
import com.serdar.domain.usecase.favoritesusecase.deleteallusecase.DeleteAllFavoriteItemUseCase
import com.serdar.domain.usecase.favoritesusecase.deleteitemusecase.DeleteFavoriteItemUseCase
import com.serdar.domain.usecase.favoritesusecase.readallitemusecase.ReadAllFavoriteItemUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FavoriteViewModel @Inject constructor(
    private val readAllFavoriteItemUseCase: ReadAllFavoriteItemUseCase,
    private val deleteAllFavoriteItemUseCase: DeleteAllFavoriteItemUseCase,
    private val deleteFavoriteItemUseCase: DeleteFavoriteItemUseCase,
) : ViewModel() {

    // Backing field & encapsulation
    private val _favoriteUiState = MutableLiveData<List<FavoritesDataModel>>()
    val favoriteUiList: LiveData<List<FavoritesDataModel>> get() = _favoriteUiState

    init {
        readAllFavoriteItemFromDatabase()
    }

    // Backing field & encapsulation
    // private val _productUiState = MutableLiveData<FavoriteUiState>()
    //  val productFavoriteUiState: LiveData<FavoriteUiState> = _productUiState


    private fun readAllFavoriteItemFromDatabase() {
        viewModelScope.launch {
            readAllFavoriteItemUseCase()
                .onStart { println("onStart") }
                .onCompletion { println("onCompletion") }
                .collect { response ->
                    _favoriteUiState.postValue(response)
                }
        }
    }

    fun deleteFavoriteItemFromDatabase(item: FavoritesDataModel) {
        viewModelScope.launch {
            deleteFavoriteItemUseCase(item)

        }
    }

}
