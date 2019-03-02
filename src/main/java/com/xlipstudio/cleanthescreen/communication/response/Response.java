package com.xlipstudio.cleanthescreen.communication.response;

import java.io.Serializable;

public class Response implements Serializable {

    private static final long serialVersionUID = -5265570698900183349L;
    private boolean result;
    private String message;
    private String code;
    private Object payload;

    public Response(boolean result, String message, String code) {
        this.result = result;
        this.message = message;
        this.code = code;
    }


    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }

}
