package com.company.ecommerce.controller;

import com.company.ecommerce.dto.request.ProductRequest;
import com.company.ecommerce.dto.response.ProductResponse;
import com.company.ecommerce.dto.response.ResponseDto;
import com.company.ecommerce.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/category/brand/product")
public class ProductController {

    private final ProductService productService;


    @GetMapping
    List<ProductResponse> findAllProducts() {
        log.info("GET - /category/brand/product -> request none");
        List<ProductResponse> response = productService.findAllProducts();
        log.info("GET - /category/brand/product -> response: {}", response);
        return response;
    }

    @PostMapping
    ResponseEntity<ResponseDto> register(@RequestBody ProductRequest productRequest) {
        log.info("POST - /category/brand/product -> request: {}", productRequest);
        ResponseEntity<ResponseDto> request = productService.register(productRequest);
        log.info("POST - /category/brand/product -> response none");
        return request;
    }

    @GetMapping("/{id}")
    ProductResponse findProductById(@PathVariable Long id) {
        log.info("GET - /category/brand/product/{} -> request", id);
        ProductResponse response = productService.findProductById(id);
        log.info("GET - /category/brand/product{} -> response: {}", response);
        return response;
    }

    @PutMapping
    ResponseEntity<ResponseDto> updateProduct(@RequestBody ProductRequest productRequest) {
        log.info("PUT - /category/brand/product{} -> request: {}", productRequest);
        ResponseEntity<ResponseDto> response = productService.updateProduct(productRequest);
        log.info("PUT - /category/brand/product{} -> response: {}", response);
        return response;
    }

}
