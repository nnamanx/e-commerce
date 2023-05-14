package com.company.ecommerce.service;

import com.company.ecommerce.entity.Brand;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BrandService {
    ResponseEntity<List<Brand>> findAllBrands();

    ResponseEntity<Brand> register(Brand brand);

    // /{id}
    ResponseEntity<Brand> findBrandById(Long id);

    ResponseEntity<String> updateBrand(Brand brand);


}
