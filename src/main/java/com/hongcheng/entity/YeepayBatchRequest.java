package com.hongcheng.entity;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.List;

@XmlRootElement(name = "data")
public class YeepayBatchRequest extends BaseRequest {

    private String mBatch_No;

    private BigDecimal mTotal_Amt;

    private Integer mTotal_Num;

    private List<PayDetailVo> mItems;

    public String getBatch_No() {
        return mBatch_No;
    }

    public void setBatch_No(String pBatch_No) {
        mBatch_No = pBatch_No;
    }

    public BigDecimal getTotal_Amt() {
        return mTotal_Amt;
    }

    public void setTotal_Amt(BigDecimal pTotal_Amt) {
        mTotal_Amt = pTotal_Amt;
    }

    public Integer getTotal_Num() {
        return mTotal_Num;
    }

    public void setTotal_Num(Integer pTotal_Num) {
        mTotal_Num = pTotal_Num;
    }

    @XmlElementWrapper(name = "list")
    @XmlElement(name = "item")
    public List<PayDetailVo> getItems() {
        return mItems;
    }

    public void setItems(List<PayDetailVo> pItems) {
        mItems = pItems;
    }

    @Override
    public String toString() {
        return "YeepayBatchRequest{" +
                "mBatch_No='" + mBatch_No + '\'' +
                ", mTotal_Amt=" + mTotal_Amt +
                ", mTotal_Num=" + mTotal_Num +
                ", mItems=" + mItems +
                ", mCmd='" + mCmd + '\'' +
                ", mVersion='" + mVersion + '\'' +
                ", mMer_Id='" + mMer_Id + '\'' +
                ", mDate=" + mDate +
                '}';
    }
}
