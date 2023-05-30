package com.plcoding.weatherapp.domain.weather

import java.time.LocalDateTime

data class WeatherData(

    //Specific data for a given hour

    val time: LocalDateTime,
    val temperatureCelsius: Double,
    val pressure: Double,
    val windSpeed: Double,
    val humidity: Double,
    val weatherType: WeatherType


)
