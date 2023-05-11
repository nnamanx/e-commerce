package com.company.ecommerce.service;

import com.company.ecommerce.entity.Brand;
import com.company.ecommerce.entity.Category;
import com.company.ecommerce.entity.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CategoryService {
    // /categories
    ResponseEntity<List<Category>> findAllCategories();

    ResponseEntity<Category> register(Category category);

    // /{id}
    ResponseEntity<Category> findCategoryById(Long id);

    ResponseEntity<String> updateCategory(Category category);

//   =================


    // /brands
    ResponseEntity<List<Brand>> findAllBrands();

    ResponseEntity<Brand> register(Brand brand);

    // /{id}
    ResponseEntity<Brand> findBrandById(Long id);

    ResponseEntity<String> updateBrand(Brand brand);

//   =================

    // /products
    ResponseEntity<List<Product>> findAllProducts(); //search RequestPara

    ResponseEntity<Product> register(Product product);

    // /{id}
    ResponseEntity<Product> findProductById(Long id);

    ResponseEntity<String> updateProduct(Product product);
}
