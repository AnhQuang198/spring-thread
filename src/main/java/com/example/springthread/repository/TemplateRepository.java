package com.example.springthread.repository;

import com.example.springthread.entity.mysql.Template;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemplateRepository extends JpaRepository<Template, Integer> {
}
