package com.example.springthread.entity.mysql;

import com.example.springthread.common.Constants;
import com.example.springthread.request.FormCategoryRequest;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "form_category")
public class FormCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private String status;

    @Column(name = "category_type")
    private String categoryType;

    @Column(name = "type")
    private String type;

    @Column(name = "priority")
    private Integer priority;

    @Column(name = "color")
    private String color;

    @Column(name = "organization_id")
    private Long organizationId;

    @Column(name = "organization_code")
    private String organizationCode;

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

    public void mapData(FormCategoryRequest request) {
        setCode(request.getCode());
        setName(request.getName());
        setDescription(request.getDescription());
        setColor(request.getColor());
        setPriority(request.getPriority());
        setOrganizationCode(request.getOrganizationCode());
        setOrganizationId(request.getOrganizationId());
        setStatus(Constants.STATUS.ACTIVE);
        setCategoryType(request.getCategoryType());
        setType(request.getType());
    }
}
