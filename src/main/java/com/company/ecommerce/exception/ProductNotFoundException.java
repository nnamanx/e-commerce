package com.company.ecommerce.exception;

import com.company.ecommerce.enums.ExceptionMessageEnum;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException() {
        super(ExceptionMessageEnum.PRODUCT_NOT_FOUND_EXCEPTION.name());
    }
}
