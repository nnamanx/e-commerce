package com.company.ecommerce.service;

import com.company.ecommerce.dto.request.ProductRequest;
import com.company.ecommerce.dto.response.ProductResponse;
import com.company.ecommerce.dto.response.ResponseDto;
import com.company.ecommerce.entity.Product;
import com.company.ecommerce.repository.ProductRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {

    List<ProductResponse> findAllProducts(); //search RequestPara

    ResponseEntity<ResponseDto> register(ProductRequest productRequest);

    // /{id}
    ProductResponse findProductById(Long id);

    ResponseEntity<ResponseDto> updateProduct(ProductRequest productRequest);
}

