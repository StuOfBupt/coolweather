package com.example.a93736.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 93736 on 2019/11/12.
 */

public class Province extends DataSupport {
    private int id;                 //实体代号
    private String provinceName;    //省名称
    private int provinceCode;       //省代号
    public int getId(){
        return id;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }

}
