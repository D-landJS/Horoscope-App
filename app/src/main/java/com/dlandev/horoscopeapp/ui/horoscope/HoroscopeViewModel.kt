package com.dlandev.horoscopeapp.ui.horoscope

import androidx.lifecycle.ViewModel
import com.dlandev.horoscopeapp.data.providers.HoroscopeProvider
import com.dlandev.horoscopeapp.domain.model.HoroscopeInfo
import com.dlandev.horoscopeapp.domain.model.HoroscopeInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor(private val horoscopeProvider: HoroscopeProvider) :
    ViewModel() {

    private val _horoscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscope = _horoscope

    init {
        _horoscope.value = horoscopeProvider.getHoroscopes()
    }

    fun getHoroscope() {
    }
}