package com.turkcell.productservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("products")
public class Product {
   @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private int stock;
    private LocalDateTime cratedAt;
    private LocalDateTime updatedAt;
    private Category category;
}
