package com.company.ecommerce.controller;

import com.company.ecommerce.dto.request.ProductRequest;
import com.company.ecommerce.dto.response.ProductResponse;
import com.company.ecommerce.dto.response.ResponseDto;
import com.company.ecommerce.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/category/brand/product")
public class ProductController {

    private final ProductService productService;


    @GetMapping
    List<ProductResponse> findAllProducts() {
        return null;
    }

    @PostMapping
    ResponseEntity<ResponseDto> register(ProductRequest productRequest) {
        return null;
    }

    @GetMapping("/{id}")
    ProductResponse findProductById(@PathVariable Long id) {
        return null;
    }

    @PutMapping
    ResponseEntity<ResponseDto> updateProduct(ProductRequest productRequest) {
        return null;
    }

}
