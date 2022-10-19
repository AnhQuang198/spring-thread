package com.example.springthread.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FormCategoryRequest {
    private String code;
    private String name;
    private String description;
    private String categoryType; //ISSUE, PRIORITY, ISSUE_SOURCE
    private String type;
    private Integer priority;
    private String color;
    private Long organizationId;
    private String organizationCode;
}
