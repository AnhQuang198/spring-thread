package com.example.springthread.entity.mysql;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "form_metadata")
public class FormMetadata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "form_code")
    private String formCode;

    @Column(name = "form_name")
    private String formName;

    @Column(name = "description")
    private String description;

    @Column(name = "is_generated")
    private Integer isGenerated;

    @Column(name = "status")
    private String status;

    @Column(name = "attachments")
    private String attachments;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "updated_by")
    private Long updatedBy;

    @CreationTimestamp
    @Column(name = "created_at")
    private Timestamp createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Timestamp updatedAt;
}
