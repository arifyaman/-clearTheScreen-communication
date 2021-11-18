package com.xlipstudio.cleanthescreen.communication;

import com.xlipstudio.cleanthescreen.communication.request.Request;
import com.xlipstudio.cleanthescreen.communication.response.Response;
import com.xlipstudio.cleanthescreen.communication.sub.WrapType;

import java.io.Serializable;

public class Wrap implements Serializable {

    private static final long serialVersionUID = -5255958368837732554L;

    private WrapType wrapType;
    private Request request;
    private Response response;




    public Wrap( WrapType wrapType, Response response) {
        this.response = response;
        this.wrapType = wrapType;
    }

    public Wrap(WrapType wrapType, Request request) {
        this.wrapType = wrapType;
        this.request = request;
    }

    public Wrap() {
    }


    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public WrapType getWrapType() {
        return wrapType;
    }

    public void setWrapType(WrapType wrapType) {
        this.wrapType = wrapType;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
