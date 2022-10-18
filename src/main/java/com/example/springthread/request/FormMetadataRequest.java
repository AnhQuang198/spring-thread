package com.example.springthread.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FormMetadataRequest {
    private String formCode;
    private String formName;
    private Long issueCategoryId;
    private String description;
    private String status;
    private List<String> attachments;
    private List<ColumnMetadataRequest> columnMetadata;
}
