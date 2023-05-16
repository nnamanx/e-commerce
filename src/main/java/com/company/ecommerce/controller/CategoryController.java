package com.company.ecommerce.controller;

import com.company.ecommerce.dto.request.CategoryRequest;
import com.company.ecommerce.dto.response.CategoryResponse;
import com.company.ecommerce.dto.response.ResponseDto;
import com.company.ecommerce.service.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {
    private final CategoryService categoryService;
//    private static final Logger logger = (Logger) LoggerFactory.getLogger(CategoryController.class);

    @GetMapping
    List<CategoryResponse> findAllCategories() {
        log.info("GET - /category -> request none");
        List<CategoryResponse> response = categoryService.findAll();
        log.info("GET - /category -> response: {}", response);
        return response;

    }

    @PostMapping
    ResponseEntity<ResponseDto> register(@RequestBody CategoryRequest categoryRequest) { //RequestBody
        log.info("POST - /category -> request: {}", categoryRequest);
        ResponseEntity<ResponseDto> request = categoryService.register(categoryRequest);
        log.info("POST - /category -> response: {}", request);
        return request;
    }

    @GetMapping("/{id}")
    CategoryResponse findCategoryById(@PathVariable Long id) {
        log.info("GET - /category/{} -> request", id);
        CategoryResponse response = categoryService.findCategoryById(id);
        log.info("GET - /category/{} -> response : {}", response);
        return response;
    }

    @PutMapping
    ResponseEntity<ResponseDto> updateCategory(@RequestBody CategoryRequest categoryRequest) {
        log.info("PUT - /category/{} -> request: {}", categoryRequest);
        ResponseEntity<ResponseDto> response = categoryService.updateCategory(categoryRequest);
        log.info("PUT - /category/{} -> response: {}", response);
        return response;
    }


}
