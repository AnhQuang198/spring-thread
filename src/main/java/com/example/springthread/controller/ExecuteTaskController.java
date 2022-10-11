package com.example.springthread.controller;

import com.example.springthread.request.TaskRequest;
import com.example.springthread.service.TaskExecuteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/exec")
public class ExecuteTaskController {
    @Autowired
    private TaskExecuteService taskExecuteService;

    @GetMapping
    public ResponseEntity<?> get() {
        return taskExecuteService.getData();
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody TaskRequest request) {
        return taskExecuteService.save(request);
    }
}
