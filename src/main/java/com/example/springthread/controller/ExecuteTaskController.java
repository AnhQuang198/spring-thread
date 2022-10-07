package com.example.springthread.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/exec")
public class ExecuteTaskController {

    @GetMapping
    public ResponseEntity<?> get() {
        return ResponseEntity.ok("Nothing...!");
    }
}
