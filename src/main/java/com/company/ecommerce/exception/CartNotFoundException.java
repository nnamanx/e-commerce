package com.company.ecommerce.exception;

import com.company.ecommerce.enums.ExceptionMessageEnum;

public class CartNotFoundException extends RuntimeException {
    public CartNotFoundException() {
        super(ExceptionMessageEnum.CART_NOT_FOUND_EXCEPTION.name());
    }
}
