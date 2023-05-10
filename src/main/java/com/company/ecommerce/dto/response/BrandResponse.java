package com.company.ecommerce.dto.response;

import com.company.ecommerce.entity.Category;
import com.company.ecommerce.entity.Product;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BrandResponse {

    String name;
    String info;
    List<Category> categories;
    List<Product> products;

}
