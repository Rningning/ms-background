package com.robert.ms.dto;

public class ResponseDto<T> extends BaseModel {
    private int code;
    private T data;
    private String message;

    public ResponseDto() {
    }

    public ResponseDto(T data) {
        this.data = data;
    }

    public ResponseDto(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
