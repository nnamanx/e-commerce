package com.company.ecommerce.dto.response;

import com.company.ecommerce.entity.Brand;
import com.company.ecommerce.entity.Cart;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductResponse {

    String name;
    String info;
    double price;
    int remainCount;
    Brand brands;
    Cart cart;

}
