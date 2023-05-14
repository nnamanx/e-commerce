package com.company.ecommerce.service;

import com.company.ecommerce.entity.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {

    ResponseEntity<List<Product>> findAllProducts(); //search RequestPara

    ResponseEntity<Product> register(Product product);

    // /{id}
    ResponseEntity<Product> findProductById(Long id);

    ResponseEntity<String> updateProduct(Product product);
}

