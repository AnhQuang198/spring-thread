package com.example.springthread.service;

import com.example.springthread.entity.mysql.Template;
import com.example.springthread.repository.TableCommonRepository;
import com.example.springthread.repository.TemplateRepository;
import com.example.springthread.request.TemplateRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class TemplateService {
    ObjectMapper mapper = new ObjectMapper();

    @Autowired
    private TemplateRepository templateRepository;

    @Autowired
    private TableCommonRepository tableCommonRepository;

    public ResponseEntity<?> save(TemplateRequest request) {
        try {
            Template template = new Template();
            template.setName(request.getName());
            template.setDescription(request.getDescription());
            template.setActive(request.isActive());
            template.setType(request.getType());
            template.setTemplateImageUrl(null);
            template.setConfigs(mapper.writeValueAsString(request.getColumnConfigs()));
            templateRepository.save(template);
            //create table
            tableCommonRepository.createTable("test", request.getColumnConfigs());
        } catch (Exception e) {
            log.error("Error: {}", e);
        }
        return ResponseEntity.ok(HttpStatus.CREATED);
    }
}
