package com.hongcheng.entity;

public class AddrDetlEntity {
    private Integer mParentId;

    private String mName;

    private Integer mCode;

    private Integer mType;

    public AddrDetlEntity(Integer pParentId, String pName, Integer pCode, Integer pType) {
        mParentId = pParentId;
        mName = pName;
        mCode = pCode;
        mType = pType;
    }

    public AddrDetlEntity() {
    }

    public Integer getParentId() {
        return mParentId;
    }

    public void setParentId(Integer pParentId) {
        mParentId = pParentId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String pName) {
        mName = pName;
    }

    public Integer getCode() {
        return mCode;
    }

    public void setCode(Integer pCode) {
        mCode = pCode;
    }

    public Integer getType() {
        return mType;
    }

    public void setType(Integer pType) {
        mType = pType;
    }
}
