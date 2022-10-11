package com.example.springthread.worker;

import lombok.Getter;

public class TaskThread implements Runnable {
    @Getter
    private int number = 0;
    private int count = 0;

    public TaskThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int randomNumber = 0;
        do {
            randomNumber = (int) (Math.random() * 100 + 1);
            count++;
            System.out.println(getNumber() + " đoán số " + randomNumber);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (randomNumber != number);
        System.out.println(getNumber() + " đã đoán số " + number + " trong " + count);
    }
}
