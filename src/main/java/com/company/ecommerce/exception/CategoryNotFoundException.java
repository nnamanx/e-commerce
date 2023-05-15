package com.company.ecommerce.exception;

import com.company.ecommerce.enums.ExceptionMessageEnum;
import com.company.ecommerce.service.CategoryService;

public class CategoryNotFoundException extends RuntimeException{
    public CategoryNotFoundException(){
        super(ExceptionMessageEnum.CATEGORY_NOT_FOUND_EXCEPTION.name());
    }
}
