package com.example.springthread.repository;

import com.example.springthread.entity.TaskExecute;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<TaskExecute, String> {
}
