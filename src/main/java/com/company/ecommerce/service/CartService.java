package com.company.ecommerce.service;

import com.company.ecommerce.dto.request.CartRequest;
import com.company.ecommerce.dto.response.CartResponse;
import com.company.ecommerce.dto.response.ResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CartService {

    List<CartResponse> findAllCart();

    ResponseEntity<ResponseDto> addProduct(CartRequest cartRequest);

    ResponseEntity<ResponseDto> delete(Long id);

    CartResponse findProductById(Long id);
    //checkout
}
