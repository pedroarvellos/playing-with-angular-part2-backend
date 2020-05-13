package com.roles.roles.exception;

public class ErrorException extends RuntimeException {
    private ErrorCodes errorCodes;

    public ErrorCodes getErrorCodes() {
        return errorCodes;
    }

    public void setErrorCodes(ErrorCodes errorCodes) {
        this.errorCodes = errorCodes;
    }

    public ErrorException(ErrorCodes errorCodes) {
        super();
        this.errorCodes = errorCodes;
    }
}
