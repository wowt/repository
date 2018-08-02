package com.hongcheng.entity;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.util.Date;

public class BaseRequest {

    protected String mCmd;

    protected String mVersion;

    protected String mMer_Id;

    protected String mDate;

    protected Date mTime;

    public String getCmd() {
        return mCmd;
    }

    public void setCmd(String pCmd) {
        mCmd = pCmd;
    }

    public String getVersion() {
        return mVersion;
    }

    public void setVersion(String pVersion) {
        mVersion = pVersion;
    }

    public String getMer_Id() {
        return mMer_Id;
    }

    public void setMer_Id(String pMer_Id) {
        mMer_Id = pMer_Id;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String pDate) {
        mDate = pDate;
    }

    public Date getTime() {
        return mTime;
    }

    public void setTime(Date pTime) {
        mTime = pTime;
    }

    @Override
    public String toString() {
        return "BaseRequest{" +
                "mCmd='" + mCmd + '\'' +
                ", mVersion='" + mVersion + '\'' +
                ", mMer_Id='" + mMer_Id + '\'' +
                ", mDate=" + mDate +
                '}';
    }
}
