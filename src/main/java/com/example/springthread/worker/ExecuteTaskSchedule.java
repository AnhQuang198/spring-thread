package com.example.springthread.worker;

import com.example.springthread.entity.mongo.UserMongo;
import com.example.springthread.entity.mysql.User;
import com.example.springthread.repository.UserRepository;
import com.example.springthread.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Component
@Log4j2
public class ExecuteTaskSchedule {
    @Value("${scheduled.task.enable}")
    private boolean enable;

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

//    @Scheduled(cron = "${scheduled.task.cron}")
//    private void executeTask() {
//        if (enable) {
//            //nhet vao thread pool
//            int corePoolSize = 10;
//            int maximumPoolSize = 20;
//            long keepAliveTime = 500;
//            TimeUnit unit = TimeUnit.SECONDS;
//
//            //Queue chứa các Task đang đợi
//            LinkedBlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>();
//
//            RejectedExecutionHandler handler = new ThreadPoolExecutor.CallerRunsPolicy();
//
//            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize,
//                    maximumPoolSize, keepAliveTime, unit, workQueue, handler);
//
//            for (int i = 0; i < 2; i++) {
//                System.out.println("Count: " + i);
//                threadPoolExecutor.execute(new TaskThread(15));
//            }
//        }
//    }

    @Scheduled(cron = "${scheduled.task.cron}")
    private void syncDataMysql() {
        if (enable) {
            int corePoolSize = 10;
            int maximumPoolSize = 20;
            long keepAliveTime = 500;
            TimeUnit unit = TimeUnit.SECONDS;
            LinkedBlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>();

            RejectedExecutionHandler handler = new ThreadPoolExecutor.CallerRunsPolicy();

            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize,
                    maximumPoolSize, keepAliveTime, unit, workQueue, handler);

            long totalUser = userService.countUser();
            if (totalUser >= corePoolSize) {
                int page = 0;
                int pageSize = 10;
                int count = (int) totalUser / pageSize;
                for (int i = 0; i <= count; i++) {
                    List<UserMongo> userPage = userService.getUserDataMongo(page, pageSize);
                    for (UserMongo usMg : userPage) {
                        User user = new User();
                        user.map(usMg);
                        threadPoolExecutor.execute(new SaveUserThread(userRepository, user));
                    }
                    page += 1;
                }
            }
        }
    }
}
