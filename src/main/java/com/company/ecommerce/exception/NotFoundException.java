package com.company.ecommerce.exception;

import com.company.ecommerce.enums.ExceptionMessageEnum;

public class NotFoundException extends RuntimeException {

    public NotFoundException() {
        super(ExceptionMessageEnum.NOT_FOUND_EXCEPTION.name());
    }
}
