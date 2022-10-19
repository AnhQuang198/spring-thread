package com.example.springthread.controller;

import com.example.springthread.request.FormCategoryRequest;
import com.example.springthread.service.FormCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/category")
public class FormCategoryController {
    @Autowired
    private FormCategoryService formCategoryService;

    @GetMapping
    public ResponseEntity<?> getCategories(@RequestParam String type, Pageable pageable) {
        return formCategoryService.getCategories(type, pageable);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCategory(@PathVariable long id) {
        return formCategoryService.getCategory(id);
    }

    @PostMapping
    public ResponseEntity<?> saveCategory(@RequestBody FormCategoryRequest request) {
        return formCategoryService.saveCategory(request);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateCategory(@PathVariable long id, @RequestBody FormCategoryRequest request) {
        return formCategoryService.updateCategory(id, request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCategory(@PathVariable long id) {
        return formCategoryService.deleteCategory(id);
    }
}
