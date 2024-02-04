package com.spring.playerapi.model;

public class PlayerError {
    private int statusCode;
    private String timeStamp;
    private String message;

    public PlayerError(int statusCode, String timeStamp, String message) {
        this.statusCode = statusCode;
        this.timeStamp = timeStamp;
        this.message = message;
    }

    public PlayerError() {
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
