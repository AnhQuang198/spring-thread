package com.example.springthread.repository;

import com.example.springthread.entity.mysql.ColumnMetadata;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColumnMetadataRepository extends JpaRepository<ColumnMetadata, Long> {
}
