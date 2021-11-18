package com.xlipstudio.cleanthescreen.communication.request;

import java.io.Serializable;

public class Request implements Serializable {

    private static final long serialVersionUID = -3249127851416559292L;


    private RequestType requestType;
    private Object payload;

    public Request(RequestType requestType, Object payload) {
        this.requestType = requestType;
        this.payload = payload;
    }

    public Request() {
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }
}
