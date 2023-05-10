package com.company.ecommerce.dto.response;

import com.company.ecommerce.entity.Customer;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AddressResponse {
    List<Customer> customers;
}
