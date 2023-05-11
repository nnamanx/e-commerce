package com.company.ecommerce.service.impl;

import com.company.ecommerce.entity.Brand;
import com.company.ecommerce.entity.Category;
import com.company.ecommerce.entity.Product;
import com.company.ecommerce.service.CartService;
import com.company.ecommerce.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Override
    public ResponseEntity<List<Category>> findAllCategories() {
        return null;
    }

    @Override
    public ResponseEntity<Category> register(Category category) {
        return null;
    }

    @Override
    public ResponseEntity<Category> findCategoryById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<String> updateCategory(Category category) {
        return null;
    }

    @Override
    public ResponseEntity<List<Brand>> findAllBrands() {
        return null;
    }

    @Override
    public ResponseEntity<Brand> register(Brand brand) {
        return null;
    }

    @Override
    public ResponseEntity<Brand> findBrandById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<String> updateBrand(Brand brand) {
        return null;
    }

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
