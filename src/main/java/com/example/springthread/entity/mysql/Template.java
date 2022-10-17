package com.example.springthread.entity.mysql;

import com.example.springthread.request.ColumnConfig;
import com.example.springthread.request.TemplateRequest;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "template")
@Data
public class Template {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "description")
    private String description;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "template_image_url")
    private String templateImageUrl;

    @Column(name = "configs")
    private String configs;

    @Column(name = "created_at")
    @CreationTimestamp
    private Timestamp createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Timestamp updatedAt;

    @Data
    public static class Config {
        private String columnName;
        private String columnCode;
        private boolean isNull;
        private String dataType;
    }
}
