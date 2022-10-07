package com.example.springthread.service;

import com.example.springthread.entity.TaskExecute;
import com.example.springthread.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TaskExecuteService {

    @Autowired
    private TaskRepository taskRepository;

    public ResponseEntity<?> save() {
        TaskExecute task = new TaskExecute();
        task.setTaskName("Run count total employee");
        taskRepository.save(task);
        return ResponseEntity.ok("Success");
    }
}
