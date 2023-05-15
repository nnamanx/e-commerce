package com.company.ecommerce.handler;

import com.company.ecommerce.dto.response.ExceptionResponse;
import com.company.ecommerce.enums.ExceptionMessageEnum;
import com.company.ecommerce.exception.BrandNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BrandNotFoundExceptionHandler {

    @ExceptionHandler({BrandNotFoundException.class, BrandNotFoundException.class})//?
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExceptionResponse handle() {
        return ExceptionResponse.builder()
                .message(ExceptionMessageEnum.BRAND_NOT_FOUND_EXCEPTION.name())
                .build();
    }
}
