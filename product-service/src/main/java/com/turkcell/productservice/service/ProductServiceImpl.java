package com.turkcell.productservice.service;

import com.turkcell.productservice.dto.CreateProductDto;
import com.turkcell.productservice.entity.Category;
import com.turkcell.productservice.entity.Product;
import com.turkcell.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;
    private final CategoryService categoryService;
    @Override
    public void create(CreateProductDto createProduct) {
        Category category = categoryService.getById(createProduct.getCategoryId());
        Product product = new Product();
        product.setName(createProduct.getName());
        product.setPrice(createProduct.getPrice());
        product.setDescription(createProduct.getDescription());
        product.setStock(createProduct.getStock());
        product.setCategory(category);

        productRepository.save(product);
    }
}
