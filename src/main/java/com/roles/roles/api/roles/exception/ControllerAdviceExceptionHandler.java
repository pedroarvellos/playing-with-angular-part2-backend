package com.roles.roles.api.roles.exception;

import com.roles.roles.exception.ErrorTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerAdviceExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(RoleNotFoundException.class)
    protected ResponseEntity<Object> handleEntity(RoleNotFoundException c) {
        ErrorTemplate error = new ErrorTemplate(c.getErrorCodes().getCode(), c.getErrorCodes().getMessage());
        return new ResponseEntity<>(error, c.getErrorCodes().getHttpCode());
    }
}
