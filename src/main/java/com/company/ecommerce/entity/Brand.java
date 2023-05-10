package com.company.ecommerce.entity;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Entity
@Table(name = "brand")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String info;

    @ManyToMany(cascade = CascadeType.PERSIST) //mappedby done
    List<Category> categories;

    @OneToMany(mappedBy = "brand", cascade = CascadeType.PERSIST)
    List<Product> products;

}

