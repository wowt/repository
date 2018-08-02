package com.hongcheng.test;

import com.hongcheng.entity.PayDetailVo;
import com.hongcheng.entity.YeepayBatchRequest;
import com.hongcheng.jaxb.XmlAndObjConvert;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {

    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {

        YeepayBatchRequest req = new YeepayBatchRequest();

        req.setCmd("AccountBalanaceQuery");
        req.setDate(format.format(new Date()));
        req.setMer_Id("whc-11111");
        req.setVersion("1.0");
        req.setBatch_No("23423423423");
        req.setTotal_Amt(new BigDecimal("23.6"));
        req.setTotal_Num(3);
        req.setTime(new Date());

        List<PayDetailVo> items = new ArrayList<PayDetailVo>();

        PayDetailVo vo1 = new PayDetailVo();
        vo1.setOrder_Id("12314413");
        vo1.setAmount(new BigDecimal("10.6"));
        vo1.setBank_Code("ICBC");
        items.add(vo1);

        PayDetailVo vo2 = new PayDetailVo();
        vo2.setOrder_Id("2343243242");
        vo2.setAmount(new BigDecimal("11.11"));
        vo2.setBank_Code("哈哈哈");
        items.add(vo2);

        PayDetailVo vo3 = new PayDetailVo();
        vo3.setOrder_Id("23432423");
        vo3.setAmount(new BigDecimal("123.11"));
        vo3.setBank_Code("HSSS");
        items.add(vo3);

        req.setItems(items);

        String s = XmlAndObjConvert.convertToXml(req);
        System.out.println(s);

        YeepayBatchRequest request = XmlAndObjConvert.convertXmlStrToObject(YeepayBatchRequest.class, s);
        System.out.println(request);
    }
}
