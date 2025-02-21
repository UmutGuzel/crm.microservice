package com.turkcell.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductDto {
    private String name;
    private String description;
    private double price;
    private int stock;
    private String categoryId;
}
