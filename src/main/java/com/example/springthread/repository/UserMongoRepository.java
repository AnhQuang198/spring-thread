package com.example.springthread.repository;

import com.example.springthread.entity.mongo.UserMongo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserMongoRepository extends MongoRepository<UserMongo, String> {
}
