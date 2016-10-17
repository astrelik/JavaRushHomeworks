package com.javarush.test.level30.lesson04.home01;

/**
 * Created by strel on 03/10/2016.
 */
import java.util.concurrent.TransferQueue;

public class Consumer implements Runnable {
    private TransferQueue<ShareItem> queue;

    public Consumer(TransferQueue<ShareItem> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(500);
            while (!Thread.currentThread().isInterrupted()) {
                ShareItem item = queue.take();
                System.out.println("Processing " + item.toString());
            }
        }
        catch (InterruptedException e) {

        }
    }
}
