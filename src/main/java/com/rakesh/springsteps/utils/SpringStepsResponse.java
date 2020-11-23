package com.rakesh.springsteps.utils;

import lombok.Data;

@Data
public class SpringStepsResponse {
    private Object data;
    private boolean result;
    private String message;
    private Integer status;

    public SpringStepsResponse(boolean result) {
        this.result = result;
    }

    public SpringStepsResponse(String message) {
        this.message = message;
    }

    public SpringStepsResponse(Object data, boolean result, String message) {
        this.data = data;
        this.result = result;
        this.message = message;
    }

    public SpringStepsResponse(boolean result, String message) {
        this.result = result;
        this.message = message;
    }
    public SpringStepsResponse(boolean result, Object data) {
        this.result = result;
        this.data = data;
    }
}
