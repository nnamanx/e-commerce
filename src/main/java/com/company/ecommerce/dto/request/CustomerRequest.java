package com.company.ecommerce.dto.request;

import com.company.ecommerce.entity.Address;
import com.company.ecommerce.entity.Cart;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerRequest {

    Long id;
    String name;
    String surname;
    String email;
    Address address;
    Cart cart;
}
