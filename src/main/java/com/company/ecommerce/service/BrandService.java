package com.company.ecommerce.service;

import com.company.ecommerce.dto.request.BrandRequest;
import com.company.ecommerce.dto.response.BrandResponse;
import com.company.ecommerce.dto.response.ResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BrandService {
    List<BrandResponse> findAllBrands();

    ResponseEntity<ResponseDto> register(BrandRequest brandRequest);

    BrandResponse findBrandById(Long id);

    ResponseEntity<ResponseDto> updateBrand(BrandRequest brandRequest);


}
