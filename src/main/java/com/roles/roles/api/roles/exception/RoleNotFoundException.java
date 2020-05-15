package com.roles.roles.api.roles.exception;

import com.roles.roles.exception.ErrorCodes;
import com.roles.roles.exception.ErrorException;

public class RoleNotFoundException extends ErrorException {
    public RoleNotFoundException(ErrorCodes errorCodes) {
        super(errorCodes);
    }
}
