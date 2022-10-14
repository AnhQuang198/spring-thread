package com.example.springthread.service;

import com.example.springthread.entity.mongo.UserMongo;
import com.example.springthread.entity.mysql.User;
import com.example.springthread.repository.UserMongoRepository;
import com.example.springthread.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMongoRepository userMongoRepository;

    public List<UserMongo> getUserDataMongo(int page, int size) {
        PageRequest p = PageRequest.of(page, size);
        Page<UserMongo> users = userMongoRepository.findAll(p);
        return users.getContent();
    }

    public long countUser() {
        return userMongoRepository.count();
    }
}
