package com.company.ecommerce.dto.response;

import com.company.ecommerce.entity.Address;
import com.company.ecommerce.entity.Cart;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerResponse {
    String name;
    String surname;
    String email;
    Address address;
    Cart cart;
}
