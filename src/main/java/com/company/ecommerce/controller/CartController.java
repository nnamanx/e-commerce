package com.company.ecommerce.controller;

import com.company.ecommerce.dto.request.CartRequest;
import com.company.ecommerce.dto.response.CartResponse;
import com.company.ecommerce.dto.response.ResponseDto;
import com.company.ecommerce.service.CartService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;

    @GetMapping
    List<CartResponse> findAllCart() {
        log.info("GET - /cart -> request none");
        List<CartResponse> response = cartService.findAllCart();
        log.info("GET - /cart -> response: {}", response);
        return response;
    }

    @PostMapping
    ResponseEntity<ResponseDto> addProduct(@RequestBody CartRequest cartRequest) {

        log.info("POST - /cart -> request: {}", cartRequest);
        ResponseEntity<ResponseDto> request = cartService.addProduct(cartRequest);
        log.info("POST - /cart -> response none");
        return request;
    }

    @DeleteMapping("/{id}")
    ResponseEntity<ResponseDto> delete(@PathVariable Long id) {

        log.info("DELETE - /cart/{} -> request: {}", id);
        ResponseEntity<ResponseDto> request = cartService.delete(id);
        log.info("DELETE - /cart/{} -> response none");
        return request;
    }

    @GetMapping("/{id}")
    CartResponse findProductById(@PathVariable Long id) {

        log.info("GET - /cart/{} -> request", id);
        CartResponse response = cartService.findProductById(id);
        log.info("GET - /cart/{} -> response: {}", response);
        return response;
    }
}
