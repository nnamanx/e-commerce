package com.company.ecommerce.dto.request;

import com.company.ecommerce.entity.Customer;
import com.company.ecommerce.entity.Product;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CartRequest {

    Long id;
    int count;
    double totalAmount;
    List<Product> products;
    Customer customer;
}
