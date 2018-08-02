package com.hongcheng.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

public class PayDetailVo {

    protected String mOrder_Id;

    protected String mBank_Code;

    protected BigDecimal mAmount;

    public String getOrder_Id() {
        return mOrder_Id;
    }

    public void setOrder_Id(String pOrder_Id) {
        mOrder_Id = pOrder_Id;
    }

    public String getBank_Code() {
        return mBank_Code;
    }

    public void setBank_Code(String pBank_Code) {
        mBank_Code = pBank_Code;
    }

    public BigDecimal getAmount() {
        return mAmount;
    }

    public void setAmount(BigDecimal pAmount) {
        mAmount = pAmount;
    }

    @Override
    public String toString() {
        return "PayDetailVo{" +
                "mOrder_Id='" + mOrder_Id + '\'' +
                ", mBank_Code='" + mBank_Code + '\'' +
                ", mAmount=" + mAmount +
                '}';
    }
}
