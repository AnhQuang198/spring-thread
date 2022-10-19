package com.example.springthread.service;

import com.example.springthread.entity.mysql.FormCategory;
import com.example.springthread.repository.FormCategoryRepository;
import com.example.springthread.request.FormCategoryRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Log4j2
@Service
public class FormCategoryService {
    @Autowired
    private FormCategoryRepository formCategoryRepository;

    public ResponseEntity<?> saveCategory(FormCategoryRequest request) {
        try {
            FormCategory category = new FormCategory();
            category.mapData(request);
            formCategoryRepository.save(category);
        } catch (Exception e) {
            log.error("INSERT CATEGORY ERROR: {}", e);
            //throw exception
            throw new RuntimeException("Error");
        }
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

    public ResponseEntity<?> getCategories(String type, Pageable pageable) {
        Page<FormCategory> categories = formCategoryRepository.findAllByCategoryType(type, pageable);
        return ResponseEntity.ok(categories);
    }

    public ResponseEntity<?> getCategory(long id) {
        Optional<FormCategory> formCategory = formCategoryRepository.findById(id);
        if (!formCategory.isPresent()) {
            //throw exception
            throw new RuntimeException("Error");
        }
        FormCategory category = formCategory.get();
        return ResponseEntity.ok(category);
    }

    public ResponseEntity<?> updateCategory(long id, FormCategoryRequest request) {
        Optional<FormCategory> formCategory = formCategoryRepository.findById(id);
        if (!formCategory.isPresent()) {
            //throw exception
            throw new RuntimeException("Error");
        }
        FormCategory category = formCategory.get();
        category.mapData(request);
        formCategoryRepository.save(category);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    public ResponseEntity<?> deleteCategory(long id) {
        Optional<FormCategory> formCategory = formCategoryRepository.findById(id);
        if (!formCategory.isPresent()) {
            //throw exception
            throw new RuntimeException("Error");
        }
        FormCategory category = formCategory.get();
        formCategoryRepository.delete(category);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
