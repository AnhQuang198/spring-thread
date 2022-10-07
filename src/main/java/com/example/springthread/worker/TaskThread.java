package com.example.springthread.worker;

public class TaskThread implements Runnable {
    private int number;

    public TaskThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Task number: " + number);
    }
}
