package com.company.ecommerce.service.impl;

import com.company.ecommerce.repository.CartRepository;
import com.company.ecommerce.service.CartService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;
    private final ModelMapper modelMapper;

}
