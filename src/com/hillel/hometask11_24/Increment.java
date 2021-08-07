package com.hillel.hometask11_24;


import java.util.concurrent.atomic.AtomicInteger;

public class Increment {
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

        CounterThread counterThread4 = new CounterThread();
        counterThread4.start();
        counterThread4.join();

        CounterThread counterThread5 = new CounterThread();
        counterThread5.start();
        counterThread5.join();

        CounterThread counterThread6 = new CounterThread();
        counterThread6.start();
        counterThread6.join();

        CounterThread counterThread7 = new CounterThread();
        counterThread7.start();
        counterThread7.join();

        CounterThread counterThread8 = new CounterThread();
        counterThread8.start();
        counterThread8.join();

        CounterThread counterThread9 = new CounterThread();
        counterThread9.start();
        counterThread9.join();

        CounterThread counterThread10 = new CounterThread();
        counterThread10.start();
        counterThread10.join();
    }

    public static volatile int COUNTER;


    static AtomicInteger atomicInteger = new AtomicInteger(COUNTER);

        public static void nextCounter(){
        System.out.println(atomicInteger.incrementAndGet() + " - number, name: " + Thread.currentThread().getName());
    }

    public static class CounterThread extends Thread {
        @Override
        public synchronized void run() {
            for (int i = 0; i < 1000; i++) {
                nextCounter();
            }

            atomicInteger.set(0);


        }
    }
}
