package com.company.ecommerce.dto.request;

import com.company.ecommerce.entity.Brand;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategoryRequest {

    Long id;
    String name;
    String info;
    List<Brand> brands;
}
