package com.hongcheng.entity;

import java.util.ArrayList;
import java.util.List;

public class CityInf extends CodeAndNamePair {

    private List<AreaInf> mAreaInfList;

    public CityInf(List<AreaInf> pAreaInfList) {
        mAreaInfList = pAreaInfList;
    }

    public CityInf(String pCode, String pName) {
        super(pCode, pName);
        mAreaInfList = new ArrayList<>();
    }

    public CityInf() {
    }

    public List<AreaInf> getAreaInfList() {
        return mAreaInfList;
    }

    public void setAreaInfList(List<AreaInf> pAreaInfList) {
        mAreaInfList = pAreaInfList;
    }

    @Override
    public String toString() {
        return "CityInf{" +
                "mAreaInfList=" + mAreaInfList +
                ", mCode='" + mCode + '\'' +
                ", mName='" + mName + '\'' +
                '}';
    }
}
