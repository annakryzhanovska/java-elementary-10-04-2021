package com.hillel.pruefung;

import java.util.concurrent.atomic.AtomicInteger;

public class Block {
    public static void main(String[] args) throws InterruptedException {

        CounterThread counterThread = new CounterThread();
        counterThread.start();
        counterThread.join();

        CounterThread counterThread1 = new CounterThread();
        counterThread1.start();
        counterThread1.join();

        CounterThread counterThread2 = new CounterThread();
        counterThread2.start();
        counterThread2.join();

        CounterThread counterThread3 = new CounterThread();
        counterThread3.start();
        counterThread3.join();

    }

    public static volatile int COUNTER;
//    public static void nextCounter(){
//        System.out.println((COUNTER++)+ " - number, name: " + Thread.currentThread().getName());
//    }

    static AtomicInteger atomicInteger = new AtomicInteger(COUNTER);

    public static class CounterThread extends Thread {
        @Override
        public synchronized void run() {
//            atomicInteger.set(0);
            for (int i = 0; i < 10; i++) {
                System.out.println(atomicInteger.incrementAndGet() + " - number, name: " + Thread.currentThread().getName());
            }

            atomicInteger.set(0);


        }
    }
}
