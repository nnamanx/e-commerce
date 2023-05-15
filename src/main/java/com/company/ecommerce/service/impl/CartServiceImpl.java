package com.company.ecommerce.service.impl;

import com.company.ecommerce.dto.request.CartRequest;
import com.company.ecommerce.dto.response.CartResponse;
import com.company.ecommerce.dto.response.ResponseDto;
import com.company.ecommerce.entity.Cart;
import com.company.ecommerce.exception.CartNotFoundException;
import com.company.ecommerce.exception.NotFoundException;
import com.company.ecommerce.repository.CartRepository;
import com.company.ecommerce.service.CartService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<CartResponse> findAllCart() {
        return cartRepository.findAll().stream()
                .map(cart -> modelMapper.map(cart, CartResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public ResponseEntity<ResponseDto> addProduct(CartRequest cartRequest) {
        cartRepository.save(modelMapper.map(cartRequest, Cart.class));
        return ResponseEntity.ok(new ResponseDto("New product added successfully!"));
    }

    @Override
    public ResponseEntity<ResponseDto> delete(Long id) {
        cartRepository.delete(cartRepository.findById(id)
                .orElseThrow(CartNotFoundException::new));
        //write CART_NOT_FOUND_EXCEPTION
        return ResponseEntity.ok(new ResponseDto("The product is removed successfully!"));
    }

    @Override
    public CartResponse findProductById(Long id) {
        return modelMapper.map(
                cartRepository.findById(id).orElseThrow(CartNotFoundException::new), CartResponse.class);
        //write CART_NOT_FOUND_EXCEPTION
    }

}
