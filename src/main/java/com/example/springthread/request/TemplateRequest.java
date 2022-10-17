package com.example.springthread.request;

import lombok.Data;

import java.util.List;

@Data
public class TemplateRequest {
    private String name;
    private String type;
    private String description;
    private boolean isActive;
    private List<String> imageUrls;
    private List<ColumnConfig> columnConfigs;
}
