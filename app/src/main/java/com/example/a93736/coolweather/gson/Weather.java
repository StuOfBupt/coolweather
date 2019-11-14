package com.example.a93736.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 93736 on 2019/11/12.
 */

public class Weather {
    public static final String key = "bc0418b57b2d4918819d3974ac1285d9";
    public String status;
    public Basic basic;
    public Suggestion suggestion;
    public Now now;
    public AQI aqi;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
