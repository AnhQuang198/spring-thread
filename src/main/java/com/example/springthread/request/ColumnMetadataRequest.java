package com.example.springthread.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ColumnMetadataRequest {
    private String columnCode;
    private String columnName;
    private String dataType;
    private Long categoryId;
    private Integer maxLength;
    private String description;
}
