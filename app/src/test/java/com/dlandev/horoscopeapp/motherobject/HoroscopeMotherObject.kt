package com.dlandev.horoscopeapp.motherobject

import com.dlandev.horoscopeapp.data.network.response.PredictionResponse
import com.dlandev.horoscopeapp.domain.model.HoroscopeInfo.Aquarius
import com.dlandev.horoscopeapp.domain.model.HoroscopeInfo.Aries
import com.dlandev.horoscopeapp.domain.model.HoroscopeInfo.Cancer
import com.dlandev.horoscopeapp.domain.model.HoroscopeInfo.Capricorn
import com.dlandev.horoscopeapp.domain.model.HoroscopeInfo.Gemini
import com.dlandev.horoscopeapp.domain.model.HoroscopeInfo.Leo
import com.dlandev.horoscopeapp.domain.model.HoroscopeInfo.Libra
import com.dlandev.horoscopeapp.domain.model.HoroscopeInfo.Pisces
import com.dlandev.horoscopeapp.domain.model.HoroscopeInfo.Sagittarius
import com.dlandev.horoscopeapp.domain.model.HoroscopeInfo.Scorpio
import com.dlandev.horoscopeapp.domain.model.HoroscopeInfo.Taurus
import com.dlandev.horoscopeapp.domain.model.HoroscopeInfo.Virgo

object HoroscopeMotherObject {
    val anyResponse = PredictionResponse("date", "prediction", "taurus")

    val horoscopeInfoList =  listOf(
        Aries,
        Taurus,
        Gemini,
        Cancer,
        Leo,
        Virgo,
        Libra,
        Scorpio,
        Sagittarius,
        Capricorn,
        Aquarius,
        Pisces
    )
}