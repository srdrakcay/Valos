package com.serdar.presentation.weapon.detail

import androidx.annotation.StringRes


sealed class WeaponsDetailState {
    object Loading : WeaponsDetailState()
    data class Success(val data: List<WeaponsDetailData>) : WeaponsDetailState()
    data class Error(@StringRes val message: Int) : WeaponsDetailState()

}
