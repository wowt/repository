package com.hongcheng.test;

import com.hongcheng.entity.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProAndCityAndAreaTest {

    private static List<AddrDetlEntity> list;

    static {

        list = new ArrayList<AddrDetlEntity>();
        list.add(new AddrDetlEntity(100000,"四川省",510000,2));
        list.add(new AddrDetlEntity(100000,"广东省",210000,2));
        list.add(new AddrDetlEntity(100000,"北京省",110000,2));
        list.add(new AddrDetlEntity(100000,"上海省",310000,2));
        list.add(new AddrDetlEntity(510000,"成都市",510100,3));
        list.add(new AddrDetlEntity(510000,"都江堰市",510200,3));
        list.add(new AddrDetlEntity(210000,"佛山市",210100,3));
        list.add(new AddrDetlEntity(210000,"广州市",210200,3));
        list.add(new AddrDetlEntity(110000,"大河市",110100,3));
        list.add(new AddrDetlEntity(310000,"珠江市",310100,3));
        list.add(new AddrDetlEntity(510100,"高新区",510101,4));
        list.add(new AddrDetlEntity(510100,"双流区",510102,4));
        list.add(new AddrDetlEntity(210100,"下河区",210101,4));

    }

    public static void main(String[] args) {
        List<ProvinceInf> provList = new ArrayList<ProvinceInf>();
        Map<Integer, ? super CodeAndNamePair> map = new HashMap<>();
        for (AddrDetlEntity entity : list) {
            Object object = map.get(entity.getParentId());
            if (entity.getType().equals(2)){
                ProvinceInf provinceInf = new ProvinceInf(entity.getCode().toString(), entity.getName());
                map.put(entity.getCode(),provinceInf);
                provList.add(provinceInf);
            } else if (entity.getType().equals(3)) {
                ProvinceInf prov = (ProvinceInf) object;
                CityInf cityInf = new CityInf(entity.getCode().toString(),entity.getName());
                prov.getCityInfList().add(cityInf);
                map.put(entity.getCode(),cityInf);
            } else if (entity.getType().equals(4)) {
                CityInf cityInf = (CityInf) object;
                AreaInf areaInf = new AreaInf(entity.getCode().toString(), entity.getName());
                cityInf.getAreaInfList().add(areaInf);
            }
        }

        System.out.println(map);
    }
}
