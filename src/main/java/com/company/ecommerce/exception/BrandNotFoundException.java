package com.company.ecommerce.exception;

import com.company.ecommerce.enums.ExceptionMessageEnum;

public class BrandNotFoundException extends RuntimeException {
    public BrandNotFoundException() {
        super(ExceptionMessageEnum.BRAND_NOT_FOUND_EXCEPTION.name());
    }
}
