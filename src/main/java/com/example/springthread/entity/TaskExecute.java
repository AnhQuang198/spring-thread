package com.example.springthread.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.sql.Timestamp;

@Getter
@Setter
@Document(collection = "task_execute")
public class TaskExecute {
    @Id
    private Long id;

    @Field(value = "task_name")
    private String taskName;

    @Field(value = "created_at")
    private Timestamp createdAt;

    @Field(value = "updated_at")
    private Timestamp updatedAt;
}
