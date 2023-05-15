package com.company.ecommerce.handler;

import com.company.ecommerce.dto.response.ExceptionResponse;
import com.company.ecommerce.enums.ExceptionMessageEnum;
import com.company.ecommerce.exception.CategoryNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CategoryNotFoundExceptionHandler {

    @ExceptionHandler({CategoryNotFoundException.class, CategoryNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExceptionResponse handle() {
        return ExceptionResponse.builder()
                .message(ExceptionMessageEnum.CATEGORY_NOT_FOUND_EXCEPTION.name())
                .build();
    }
}

