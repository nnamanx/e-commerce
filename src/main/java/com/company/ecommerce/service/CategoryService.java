package com.company.ecommerce.service;

import com.company.ecommerce.dto.request.CategoryRequest;
import com.company.ecommerce.dto.response.CategoryResponse;
import com.company.ecommerce.dto.response.ResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CategoryService {
    List<CategoryResponse> findAll();

    ResponseEntity<ResponseDto> register(CategoryRequest categoryRequest);

    CategoryResponse findCategoryById(Long id);

    ResponseEntity<ResponseDto> updateCategory(CategoryRequest categoryRequest);


}
