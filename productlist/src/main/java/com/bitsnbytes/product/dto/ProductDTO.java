package com.bitsnbytes.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
We create all variable private in DTO layer
 */
@Data //generates getters, setters, equals, hashCode, and toString automatically.
@AllArgsConstructor //Generates a constructor with all fields as parameters.
// public Product(Long id, String name, Double price) { ... }
@NoArgsConstructor //Generates a default constructor (no parameters).
public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Long Category;
}
