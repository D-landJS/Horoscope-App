package com.dlandev.horoscopeapp.ui.detail

import com.dlandev.horoscopeapp.domain.model.HoroscopeModel

sealed class HoroscopeDetailState {
    data object Loading: HoroscopeDetailState()
    data class Success(val prediction: String, val sign: String, val horoscopeModel: HoroscopeModel): HoroscopeDetailState()
    data class Error(val message: String): HoroscopeDetailState()

}