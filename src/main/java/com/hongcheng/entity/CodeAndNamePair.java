package com.hongcheng.entity;

public class CodeAndNamePair {
    protected String mCode;

    protected String mName;

    public String getCode() {
        return mCode;
    }

    public void setCode(String pCode) {
        mCode = pCode;
    }

    public String getName() {
        return mName;
    }

    public void setName(String pName) {
        mName = pName;
    }

    public CodeAndNamePair() {
    }

    public CodeAndNamePair(String pCode, String pName) {
        mCode = pCode;
        mName = pName;
    }
}
