package com.hhjr.fs.entity;

import java.io.Serializable;

public class WebSecCode implements Serializable {
    //
    private Integer seqNo;

    //
    private String mobileNo;

    //
    private String operType;

    //
    private String sendState;

    //
    private String secCode;

    //
    private String effTime;

    private static final long serialVersionUID = 1L;

    public Integer getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType == null ? null : operType.trim();
    }

    public String getSendState() {
        return sendState;
    }

    public void setSendState(String sendState) {
        this.sendState = sendState == null ? null : sendState.trim();
    }

    public String getSecCode() {
        return secCode;
    }

    public void setSecCode(String secCode) {
        this.secCode = secCode == null ? null : secCode.trim();
    }

    public String getEffTime() {
        return effTime;
    }

    public void setEffTime(String effTime) {
        this.effTime = effTime == null ? null : effTime.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seqNo=").append(seqNo);
        sb.append(", mobileNo=").append(mobileNo);
        sb.append(", operType=").append(operType);
        sb.append(", sendState=").append(sendState);
        sb.append(", secCode=").append(secCode);
        sb.append(", effTime=").append(effTime);
        sb.append("]");
        return sb.toString();
    }
}