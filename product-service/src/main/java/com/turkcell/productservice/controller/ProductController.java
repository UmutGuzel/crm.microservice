package com.turkcell.productservice.controller;

import com.turkcell.productservice.dto.CreateProductDto;
import com.turkcell.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody CreateProductDto product){
        productService.create(product);

    }
}
