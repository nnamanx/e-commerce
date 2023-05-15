package com.company.ecommerce.service;

import com.company.ecommerce.dto.request.CategoryRequest;
import com.company.ecommerce.dto.response.CategoryResponse;
import com.company.ecommerce.dto.response.ResponseDto;
import com.company.ecommerce.entity.Category;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CategoryService {
    // /categories
    List<CategoryResponse> findAllCategories();

    ResponseEntity<ResponseDto> register(CategoryRequest categoryRequest);

    // /{id}
    CategoryResponse findCategoryById(Long id);

    ResponseEntity<ResponseDto> updateCategory(CategoryRequest categoryRequest);


}
