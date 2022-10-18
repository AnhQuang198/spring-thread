package com.example.springthread.repository;

import com.example.springthread.entity.mysql.FormMetadata;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormMetadataRepository extends JpaRepository<FormMetadata, Long> {
}
