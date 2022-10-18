package com.example.springthread.entity.mysql;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "column_metadata")
public class ColumnMetadata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "form_id")
    private Long formId; //id cua form metadata

    @Column(name = "form_code")
    private String formCode;

    @Column(name = "column_code")
    private String columnCode;

    @Column(name = "column_name")
    private String columnName;

    @Column(name = "data_type")
    private String dataType;

    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "max_length")
    private Integer maxLength;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private String status;

    @Column(name = "position")
    private Integer position;

    @Column(name = "search_position")
    private Integer searchPosition;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "updated_by")
    private Long updatedBy;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;
}
