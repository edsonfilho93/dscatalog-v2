package com.devsuperior.dscatalog.v2.services;

import com.devsuperior.dscatalog.v2.entities.Category;
import com.devsuperior.dscatalog.v2.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
