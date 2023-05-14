package com.company.ecommerce.service.impl;

import com.company.ecommerce.dto.request.CategoryRequest;
import com.company.ecommerce.dto.response.ResponseDto;
import com.company.ecommerce.entity.Category;
import com.company.ecommerce.exception.NotFoundException;
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

    pub Category mapToCategory(CategoryRepository category) {
        return modelMapper.map(category, Category.class);
    }

    @Override
    public ResponseEntity<List<Category>> findAllCategories() {

        return categoryRepository.findAll().stream()
                .map(this::mapToCategory) // Using method reference
                .collect(Collectors.toList());
    }

    public ResponseEntity<ResponseDto> register(CategoryRequest categoryRequest) {
        categoryRepository.save(modelMapper.map(categoryRequest, Category.class));
        return ResponseEntity.ok(new ResponseDto("Registered Successfully!"));
    }

    // {id} part
    @Override
    public Category findCategoryById(Long id) {
        return categoryRepository.findById(id).
                orElseThrow(NotFoundException::new);
    }

    @Override
    public ResponseEntity<String> updateCategory(Category category) {
        return null;
    }

}
