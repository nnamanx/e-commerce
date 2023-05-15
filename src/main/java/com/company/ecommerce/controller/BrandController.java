package com.company.ecommerce.controller;

import com.company.ecommerce.dto.request.BrandRequest;
import com.company.ecommerce.dto.response.BrandResponse;
import com.company.ecommerce.dto.response.CategoryResponse;
import com.company.ecommerce.dto.response.ResponseDto;
import com.company.ecommerce.entity.Brand;
import com.company.ecommerce.service.BrandService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/category/brand")
public class BrandController {

    private final BrandService brandService;

    @GetMapping
    List<BrandResponse> findAllBrands() {
        log.info("GET - /category/brand -> request none");
        List<BrandResponse> response = brandService.findAllBrands();
        log.info("GET - /category/brand -> response: {}", response);
        return response;
    }

    @PostMapping
    ResponseEntity<ResponseDto> register(@RequestBody BrandRequest brandRequest) {
        log.info("POST - /category/brand -> request: {}", brandRequest);
        ResponseEntity<ResponseDto> request = brandService.register(brandRequest);
        log.info("POST - /category/brand -> response none");
        return request;
    }

    @GetMapping("/{id}")
    BrandResponse findBrandById(@PathVariable Long id) {
        log.info("GET - /category/brand/{} -> request", id);
        BrandResponse response = brandService.findBrandById(id);
        log.info("GET - /category/brand/{} -> response: {}", response);
        return response;
    }

    @PutMapping
    ResponseEntity<ResponseDto> updateBrand(@RequestBody BrandRequest brandRequest) {
        log.info("PUT - /category/brand/{} -> request: {}", brandRequest);
        ResponseEntity<ResponseDto> response = brandService.updateBrand(brandRequest);
        log.info("PUT - /category/brand/{} -> response: {}", response);
        return response;
    }


}
