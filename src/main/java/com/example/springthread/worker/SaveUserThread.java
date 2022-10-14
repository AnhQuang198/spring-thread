package com.example.springthread.worker;

import com.example.springthread.entity.mysql.User;
import com.example.springthread.repository.UserRepository;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class SaveUserThread implements Runnable {
    private UserRepository userRepository;

    private User user;

    public SaveUserThread(UserRepository userRepository, User user) {
        this.userRepository = userRepository;
        this.user = user;
    }

    @Override
    public void run() {
        try {
            userRepository.save(user);
        } catch (Exception e) {
            log.error("Save User Mysql error: {0}", e);
        }
    }
}
