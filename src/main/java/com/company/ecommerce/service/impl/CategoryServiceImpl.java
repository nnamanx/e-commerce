package com.company.ecommerce.service.impl;

import com.company.ecommerce.dto.request.CategoryRequest;
import com.company.ecommerce.dto.response.CategoryResponse;
import com.company.ecommerce.dto.response.ResponseDto;
import com.company.ecommerce.entity.Category;
import com.company.ecommerce.exception.CategoryNotFoundException;
import com.company.ecommerce.repository.CategoryRepository;
import com.company.ecommerce.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    public Category mapToCategory(CategoryRepository category) {
        return modelMapper.map(category, Category.class);
    } //no need

    @Override
    public List<CategoryResponse> findAll() {

        return categoryRepository.findAll().stream()
                .map(category -> modelMapper.map(category, CategoryResponse.class))
                .collect(Collectors.toList());
    }

    public ResponseEntity<ResponseDto> register(CategoryRequest categoryRequest) {
        categoryRepository.save(modelMapper.map(categoryRequest, Category.class));
        return ResponseEntity.ok(new ResponseDto("Registered Successfully!"));
    }

    // {id} part
    @Override
    public CategoryResponse findCategoryById(Long id) {
        return modelMapper.map(
                categoryRepository.findById(id)
                        .orElseThrow(CategoryNotFoundException::new), CategoryResponse.class);
    }

    @Override
    public ResponseEntity<ResponseDto> updateCategory(CategoryRequest categoryRequest) {
        categoryRepository.save(modelMapper.map(categoryRequest, Category.class));
        return ResponseEntity.ok(new ResponseDto("Updated Successfully!"));
    }

}
