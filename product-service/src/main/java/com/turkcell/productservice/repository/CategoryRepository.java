package com.turkcell.productservice.repository;

import com.turkcell.productservice.entity.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {
}
