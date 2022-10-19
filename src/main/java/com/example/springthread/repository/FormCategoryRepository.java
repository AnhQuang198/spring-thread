package com.example.springthread.repository;

import com.example.springthread.entity.mysql.FormCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormCategoryRepository extends JpaRepository<FormCategory, Long> {
    Page<FormCategory> findAllByCategoryType(String categoryType, Pageable pageable);
}
