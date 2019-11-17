package com.example.realweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
//市表
    private int id;

    private String cityName;

    private int cityCode;

    private int provinceCode;

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getId() {

        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceCode() {
        return provinceCode;
    }
}

