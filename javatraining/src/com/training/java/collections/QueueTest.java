package com.training.java.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class QueueTest {

    public static void main(final String[] args) {
        Queue<String> queue1 = new ArrayBlockingQueue<>(1000);
        BlockingQueue<String> queue2 = new ArrayBlockingQueue<>(1000);
        queue1.add("1");
        queue1.add("2");
        queue1.add("3");
        queue1.add("1");
        String pollLoc1 = queue1.poll();
        String pollLoc2 = queue1.poll();
        queue2.add("1");
        queue2.add("3");
        queue2.add("4");
        String poll2Loc1 = queue2.poll();
        try {
            String poll2Loc2 = queue2.take();
            String poll2Loc3 = queue2.poll(10,
                                           TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Deque<String> dequeLoc = new ArrayDeque<>(1000);


    }
}
