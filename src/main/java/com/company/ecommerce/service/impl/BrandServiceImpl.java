package com.company.ecommerce.service.impl;

import com.company.ecommerce.dto.request.BrandRequest;
import com.company.ecommerce.dto.response.BrandResponse;
import com.company.ecommerce.dto.response.ResponseDto;
import com.company.ecommerce.entity.Brand;
import com.company.ecommerce.exception.BrandNotFoundException;
import com.company.ecommerce.repository.BrandRepository;
import com.company.ecommerce.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<BrandResponse> findAllBrands() {
        return brandRepository.findAll().stream()
                .map(brand -> modelMapper.map(brand, BrandResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public ResponseEntity<ResponseDto> register(BrandRequest brandRequest) {
        brandRepository.save(modelMapper.map(brandRequest, Brand.class));
        return ResponseEntity.ok(new ResponseDto("Registered Successfully!"));
    }

    @Override
    public BrandResponse findBrandById(Long id) {
        return modelMapper.map(brandRepository.findById(id)
                .orElseThrow(BrandNotFoundException::new), BrandResponse.class);
    }

    @Override
    public ResponseEntity<ResponseDto> updateBrand(BrandRequest brandRequest) {
        brandRepository.save(modelMapper.map(brandRequest, Brand.class));
        return ResponseEntity.ok(new ResponseDto("Updated Successfully!"));
    }
}
