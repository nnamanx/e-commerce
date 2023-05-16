package com.company.ecommerce.service;

import com.company.ecommerce.dto.request.ProductRequest;
import com.company.ecommerce.dto.response.ProductResponse;
import com.company.ecommerce.dto.response.ResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {

    List<ProductResponse> findAllProducts();

    ResponseEntity<ResponseDto> register(ProductRequest productRequest);

    ProductResponse findProductById(Long id);

    ResponseEntity<ResponseDto> updateProduct(ProductRequest productRequest);
}

