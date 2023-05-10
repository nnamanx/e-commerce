package com.company.ecommerce.dto.response;

import com.company.ecommerce.entity.Brand;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.ManyToMany;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategoryResponse {

    String name;
    String info;
    List<Brand> brands;
}
