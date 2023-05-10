package com.company.ecommerce.dto.response;

import com.company.ecommerce.entity.Customer;
import com.company.ecommerce.entity.Product;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CartResponse {

    int count;
    double totalAmount;
    List<Product> products;
    Customer customer;
}
