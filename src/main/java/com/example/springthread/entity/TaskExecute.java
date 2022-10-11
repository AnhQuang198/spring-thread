package com.example.springthread.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.sql.Timestamp;

@Getter
@Setter
@Document(collection = "task_execute")
public class TaskExecute {
    @Id
    private String id;

    @Field(value = "data")
    private String data;

    @CreatedDate
    @Field(value = "created_at")
    private Timestamp createdAt;

    @LastModifiedDate
    @Field(value = "updated_at")
    private Timestamp updatedAt;
}
