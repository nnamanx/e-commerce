package com.company.ecommerce.controller;

import com.company.ecommerce.dto.request.CategoryRequest;
import com.company.ecommerce.dto.response.CategoryResponse;
import com.company.ecommerce.dto.response.ResponseDto;
import com.company.ecommerce.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/category")
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    List<CategoryResponse> findAllCategories(){
        return null;

    }

    @PostMapping
    ResponseEntity<ResponseDto> register(CategoryRequest categoryRequest){
        return null;
    }

    @GetMapping("/{id}")
    CategoryResponse findCategoryById(@PathVariable Long id){
        return null;
    }

    @PutMapping
    ResponseEntity<ResponseDto> updateCategory(CategoryRequest categoryRequest){
        return null;
    }



}
