package com.company.ecommerce.controller;

import com.company.ecommerce.dto.request.BrandRequest;
import com.company.ecommerce.dto.response.BrandResponse;
import com.company.ecommerce.dto.response.ResponseDto;
import com.company.ecommerce.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/category/brand")
public class BrandController {

    private final BrandService brandService;

    @GetMapping
    List<BrandResponse> findAllBrands() {
        return null;
    }

    @PostMapping
    ResponseEntity<ResponseDto> register(BrandRequest brandRequest) {
        return null;
    }

    @GetMapping("/{id}")
    BrandResponse findBrandById(@PathVariable Long id) {
        return null;
    }

    @PutMapping
    ResponseEntity<ResponseDto> updateBrand(BrandRequest brandRequest) {
        return null;
    }


}
