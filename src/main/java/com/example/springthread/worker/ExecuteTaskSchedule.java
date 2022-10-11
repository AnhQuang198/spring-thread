package com.example.springthread.worker;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Component
@Log4j2
public class ExecuteTaskSchedule {
    @Value("${scheduled.task.enable}")
    private boolean enable;

    @Scheduled(cron = "${scheduled.task.cron}")
    private void executeTask() {
        if (enable) {
            //nhet vao thread pool
            int corePoolSize = 10;
            int maximumPoolSize = 20;
            long keepAliveTime = 500;
            TimeUnit unit = TimeUnit.SECONDS;

            //Queue chứa các Task đang đợi
            LinkedBlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>();

            RejectedExecutionHandler handler = new ThreadPoolExecutor.CallerRunsPolicy();

            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize,
                    maximumPoolSize, keepAliveTime, unit, workQueue, handler);

            for (int i = 0; i < 2; i++) {
                System.out.println("Count: " + i);
                threadPoolExecutor.execute(new TaskThread(15));
            }
        }
    }
}
