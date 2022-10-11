package com.example.springthread.service;

import com.example.springthread.entity.TaskExecute;
import com.example.springthread.repository.TaskRepository;
import com.example.springthread.request.TaskRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TaskExecuteService {
    private static final ObjectMapper mapper = new ObjectMapper();

    @Autowired
    private TaskRepository taskRepository;

    public ResponseEntity<?> save(TaskRequest request) {
        TaskExecute task = new TaskExecute();
        try {
            task.setData(mapper.writeValueAsString(request.getData()));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        taskRepository.save(task);
        return ResponseEntity.ok("Success");
    }

    public ResponseEntity<?> getData() {
        List<TaskExecute> data = taskRepository.findAll();
        for (TaskExecute obj : data) {
            try {
                Map<String, Object> result = mapper.readValue(obj.getData(), HashMap.class);
                System.out.println(result);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
        return ResponseEntity.ok(data);
    }
}
