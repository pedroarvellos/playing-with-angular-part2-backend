package com.roles.roles.exception;

public class ErrorTemplate {
    private String status;
    private String message;
    private Long errorTime;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getErrorTime() {
        return errorTime;
    }

    public void setErrorTime(Long errorTime) {
        this.errorTime = errorTime;
    }

    public ErrorTemplate(String status, String message) {
        this.status = status;
        this.message = message;
        this.errorTime = System.currentTimeMillis();
    }
}
