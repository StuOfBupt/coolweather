package com.example.a93736.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 93736 on 2019/11/12.
 */

public class Weather {
    public String status;
    public Basic basic;
    public Suggestion suggestion;
    public Now now;
    public AQI aqi;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
