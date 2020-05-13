package com.roles.roles.exception;

import org.springframework.http.HttpStatus;

public enum ErrorCodes {
    ROLE_DOES_NOT_EXIST("1001", "Role does not exist.", HttpStatus.NOT_FOUND);

    private String code;
    private String message;
    private HttpStatus httpCode;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpCode() {
        return httpCode;
    }

    ErrorCodes(String code, String message, HttpStatus httpCode) {
        this.code = code;
        this.message = message;
        this.httpCode = httpCode;
    }
}
