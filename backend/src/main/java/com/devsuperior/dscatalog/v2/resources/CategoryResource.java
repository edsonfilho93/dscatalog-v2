package com.devsuperior.dscatalog.v2.resources;

import com.devsuperior.dscatalog.v2.entities.Category;
import com.devsuperior.dscatalog.v2.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryResource {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity findAll() {
        final var response = categoryService.findAll();
        return ResponseEntity.ok(response);
    }
}
