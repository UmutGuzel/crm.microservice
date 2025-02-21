package com.turkcell.productservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("categories")
public class Category {
    @Id
    private String id;
    private String name;
    private LocalDateTime cratedAt;
    private LocalDateTime updatedAt;
}
