package com.company.ecommerce.dto.request;

import com.company.ecommerce.entity.Brand;
import com.company.ecommerce.entity.Cart;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductRequest {

    Long id;
    String name;
    String info;
    double price;
    int remainCount;
    Brand brands;
    Cart cart;
}
