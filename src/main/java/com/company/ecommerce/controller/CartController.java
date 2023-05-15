package com.company.ecommerce.controller;

import com.company.ecommerce.dto.request.CartRequest;
import com.company.ecommerce.dto.response.CartResponse;
import com.company.ecommerce.dto.response.ResponseDto;
import com.company.ecommerce.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cart")
public class CartController {

    private final CartService cartService;

    @GetMapping
    List<CartResponse> findAllCart(){
        return null;
    }

    @PostMapping
    ResponseEntity<ResponseDto> addProduct(CartRequest cartRequest){
        return null;
    }

    @DeleteMapping("/{id}")
    ResponseEntity<ResponseDto> delete(@PathVariable Long id){
        return null;
    }

    @GetMapping("/{id}")
    CartResponse findProductById(@PathVariable Long id){
        return null;
    }
}
