package com.hillel.lesson11;

public class ClockTest {

    public static void main(String[] args) throws InterruptedException {

        Clock clock = new Clock();
        Thread thread = new Thread(clock);
        thread.start();

        Thread.sleep(5000);
        thread.interrupt();
    }

    public static class Clock implements Runnable{
        @Override
        public void run() {
            while (true){
                System.out.println("tik");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
