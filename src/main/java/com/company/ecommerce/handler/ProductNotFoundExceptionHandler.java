package com.company.ecommerce.handler;

import com.company.ecommerce.dto.response.ExceptionResponse;
import com.company.ecommerce.enums.ExceptionMessageEnum;
import com.company.ecommerce.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProductNotFoundExceptionHandler {

    @ExceptionHandler({ProductNotFoundException.class, ProductNotFoundException.class})//?
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExceptionResponse handle() {
        return ExceptionResponse.builder()
                .message(ExceptionMessageEnum.PRODUCT_NOT_FOUND_EXCEPTION.name())
                .build();
    }
}
