package com.xlipstudio.cleanthescreen.communication;

import com.xlipstudio.cleanthescreen.communication.sub.WrapType;

import java.io.Serializable;

public class Wrap implements Serializable {

    private static final long serialVersionUID = -5255958368837732554L;

    private WrapType wrapType;
    private String payload;


    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public WrapType getWrapType() {
        return wrapType;
    }

    public void setWrapType(WrapType wrapType) {
        this.wrapType = wrapType;
    }
}
