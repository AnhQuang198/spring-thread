package com.example.springthread.request;

import lombok.Data;

@Data
public class ColumnConfig {
    private String columnName;
    private String columnCode;
    private boolean isNull;
    private String dataType;
}
