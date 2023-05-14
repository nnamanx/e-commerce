package com.company.ecommerce.service;

import com.company.ecommerce.dto.request.CategoryRequest;
import com.company.ecommerce.dto.response.ResponseDto;
import com.company.ecommerce.entity.Category;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CategoryService {
    // /categories
    ResponseEntity<List<Category>> findAllCategories();

    ResponseEntity<ResponseDto> register(CategoryRequest categoryRequest);

    // /{id}
    Category findCategoryById(Long id);

    ResponseEntity<String> updateCategory(Category category);


}
