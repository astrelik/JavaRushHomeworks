package com.javarush.test.level26.lesson10.home01;

/**
 * Created by strel on 22/09/2016.
 */
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    protected BlockingQueue queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(queue.take());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(String.format("[%s] thread was terminated", Thread.currentThread().getName()));
        }
    }
}
