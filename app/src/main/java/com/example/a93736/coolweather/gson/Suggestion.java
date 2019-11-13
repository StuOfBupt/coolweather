package com.example.a93736.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 93736 on 2019/11/12.
 */

public class Suggestion {
    @SerializedName("conf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
