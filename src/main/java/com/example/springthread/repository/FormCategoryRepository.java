package com.example.springthread.repository;

import com.example.springthread.entity.mysql.FormCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormCategoryRepository extends JpaRepository<FormCategory, Long> {
}
