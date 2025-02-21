package com.turkcell.productservice.service;

import com.turkcell.productservice.dto.CreateProductDto;

public interface ProductService {
    void create(CreateProductDto product);
}
