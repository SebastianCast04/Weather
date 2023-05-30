package com.plcoding.weatherapp.domain.weather

data class WeatherInfo(

    //Weather data per day

    val weatherDataPerDay: Map<Int, List<WeatherData>>,
    val currentWeatherData: WeatherData?
)
