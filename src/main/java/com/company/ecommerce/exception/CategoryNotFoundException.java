package com.company.ecommerce.exception;

import com.company.ecommerce.enums.ExceptionMessageEnum;

public class CategoryNotFoundException extends RuntimeException {
    public CategoryNotFoundException() {
        super(ExceptionMessageEnum.CATEGORY_NOT_FOUND_EXCEPTION.name());
    }
}
