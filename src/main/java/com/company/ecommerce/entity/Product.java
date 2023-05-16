package com.company.ecommerce.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String info;
    double price;
    int remainCnt;

    @ManyToOne //mappedby done
    Brand brand;

    @ManyToOne //done
    Cart cart;
}
