package com.example.a93736.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 93736 on 2019/11/12.
 */

public class City extends DataSupport {
    private int id;                 //实体代号
    private String cityName;        //城市名称
    private int cityCode;           //城市代号
    private int provinceId;         //城市所属省份id
    public int getId(){
        return id;
    }
    public int getCityCode(){
        return cityCode;
    }
    public String getCityName(){
        return cityName;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setCityName(String cityName){
        this.cityName = cityName;
    }
    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }
    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }

}
