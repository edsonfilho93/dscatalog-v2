package com.devsuperior.dscatalog.v2.resources;

import com.devsuperior.dscatalog.v2.entities.Category;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryResource {

    @GetMapping
    public ResponseEntity findAll() {
        return ResponseEntity.ok(new Category(1L, "Livro"));
    }
}
