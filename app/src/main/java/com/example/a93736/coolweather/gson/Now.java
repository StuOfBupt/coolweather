package com.example.a93736.coolweather.gson;

import com.bumptech.glide.load.resource.SimpleResource;
import com.google.gson.annotations.SerializedName;

/**
 * Created by 93736 on 2019/11/12.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
