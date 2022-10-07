package com.example.springthread.controller;

import com.example.springthread.service.TaskExecuteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/exec")
public class ExecuteTaskController {
    @Autowired
    private TaskExecuteService taskExecuteService;

    @GetMapping
    public ResponseEntity<?> get() {
        return ResponseEntity.ok("Nothing...!");
    }

    @PostMapping
    public ResponseEntity<?> save() {
        return taskExecuteService.save();
    }
}
