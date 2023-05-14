package com.company.ecommerce.service.impl;

import com.company.ecommerce.entity.Product;
import com.company.ecommerce.repository.ProductRepository;
import com.company.ecommerce.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;


    @Override
    public ResponseEntity<List<Product>> findAllProducts() {
        return null;
    }

    @Override
    public ResponseEntity<Product> register(Product product) {
        return null;
    }

    @Override
    public ResponseEntity<Product> findProductById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<String> updateProduct(Product product) {
        return null;
    }
}
