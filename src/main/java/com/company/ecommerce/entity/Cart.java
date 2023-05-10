package com.company.ecommerce.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int count;
    double totalAmount;


    @OneToMany (mappedBy = "cart", cascade = CascadeType.PERSIST) //?
    List<Product> products;

    @OneToOne(cascade = CascadeType.MERGE)
    Customer customer;

}
