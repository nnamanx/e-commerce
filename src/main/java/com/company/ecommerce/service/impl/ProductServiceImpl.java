package com.company.ecommerce.service.impl;

import com.company.ecommerce.dto.request.ProductRequest;
import com.company.ecommerce.dto.response.ProductResponse;
import com.company.ecommerce.dto.response.ResponseDto;
import com.company.ecommerce.entity.Product;
import com.company.ecommerce.exception.NotFoundException;
import com.company.ecommerce.exception.ProductNotFoundException;
import com.company.ecommerce.repository.ProductRepository;
import com.company.ecommerce.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;


    @Override
    public List<ProductResponse> findAllProducts() {
        return productRepository.findAll().stream()
                .map(product -> modelMapper.map(product, ProductResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public ResponseEntity<ResponseDto> register(ProductRequest productRequest) {
        productRepository.save(modelMapper.map(productRequest, Product.class));
        return ResponseEntity.ok(new ResponseDto("Registered Successfully!"));
    }

    @Override
    public ProductResponse findProductById(Long id) {
        return modelMapper.map(productRepository.findById(id)
                .orElseThrow(ProductNotFoundException::new), ProductResponse.class);
    }

    @Override
    public ResponseEntity<ResponseDto> updateProduct(ProductRequest productRequest) {
        productRepository.save(modelMapper.map(productRequest, Product.class));
        return ResponseEntity.ok(new ResponseDto("Updated Successfully!"));
    }
}
