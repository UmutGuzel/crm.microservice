package com.turkcell.productservice.service;

import com.turkcell.productservice.entity.Category;
import com.turkcell.productservice.repository.CategoryRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public Category getById(String id) {
        if (id == null) {
            return null;
        }
        return categoryRepository.findById(id).orElse(null);
    }
}
