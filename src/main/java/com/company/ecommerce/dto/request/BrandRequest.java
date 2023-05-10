package com.company.ecommerce.dto.request;

import com.company.ecommerce.entity.Category;
import com.company.ecommerce.entity.Product;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BrandRequest {
    Long id;
    String name;
    String info;
    List<Category> categories;
    List<Product> products;
}
