package com.example.a93736.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 93736 on 2019/11/12.
 */

public class County extends DataSupport {
    private int id;                 //实体代号
    private String countyName;      //县名称
    private String weatherId;       //天气代号
    private int cityId;             //县所属城市代号

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName = countyName;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}
