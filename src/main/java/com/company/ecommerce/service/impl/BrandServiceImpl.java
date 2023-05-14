package com.company.ecommerce.service.impl;

import com.company.ecommerce.entity.Brand;
import com.company.ecommerce.entity.Category;
import com.company.ecommerce.repository.BrandRepository;
import com.company.ecommerce.repository.CategoryRepository;
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
    public ResponseEntity<List<Brand>> findAllBrands() {
        return (ResponseEntity<List<Brand>>) brandRepository.findAll().stream()
                .map(category -> modelMapper.map(category, BrandRepository.class)).collect((Collectors.toList()));
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
}
