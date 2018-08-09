package com.hongcheng.entity;

import java.util.ArrayList;
import java.util.List;

public class ProvinceInf extends CodeAndNamePair {

    private List<CityInf> mCityInfList;

    public ProvinceInf(String pCode, String pName) {
        super(pCode, pName);
        mCityInfList = new ArrayList<>();
    }

    public ProvinceInf() {
    }

    public List<CityInf> getCityInfList() {
        return mCityInfList;
    }

    public void setCityInfList(List<CityInf> pCityInfList) {
        mCityInfList = pCityInfList;
    }

    @Override
    public String toString() {
        return "ProvinceInf{" +
                "mCityInfList=" + mCityInfList +
                ", mCode='" + mCode + '\'' +
                ", mName='" + mName + '\'' +
                '}';
    }
}
