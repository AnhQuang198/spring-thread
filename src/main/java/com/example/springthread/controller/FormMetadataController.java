package com.example.springthread.controller;

import com.example.springthread.request.FormMetadataRequest;
import com.example.springthread.service.FormMetadataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/form")
public class FormMetadataController {
    @Autowired
    private FormMetadataService formMetadataService;

    @PostMapping
    public ResponseEntity<?> saveForm(@RequestBody FormMetadataRequest request) {
        return formMetadataService.saveFormMetadata(request);
    }
}
