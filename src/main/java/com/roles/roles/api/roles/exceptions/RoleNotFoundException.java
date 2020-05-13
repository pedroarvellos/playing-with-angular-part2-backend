package com.roles.roles.api.roles.exceptions;

import com.roles.roles.exception.ErrorCodes;
import com.roles.roles.exception.ErrorException;

public class RoleNotFoundException extends ErrorException {
    public RoleNotFoundException(ErrorCodes errorCodes) {
        super(errorCodes);
    }
}
