package com.example.springthread.service;

import com.example.springthread.repository.ColumnMetadataRepository;
import com.example.springthread.repository.FormMetadataRepository;
import com.example.springthread.request.FormMetadataRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Log4j2
@Service
public class FormMetadataService {
    @Autowired
    private FormMetadataRepository formMetadataRepository;

    @Autowired
    private ColumnMetadataRepository columnMetadataRepository;

    @Transactional
    public ResponseEntity<?> saveFormMetadata(FormMetadataRequest request) {

        return null;
    }
}
