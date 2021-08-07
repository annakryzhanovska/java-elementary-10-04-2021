package com.hillel.lesson11;

public class ThreadTest {
    public static void main(String[] args) {
        Thread thread = new PrinterThread();
        thread.start();
        System.out.println("main start");
        System.out.println("main is working");
        System.out.println("heheheh");
        System.out.println("main stop");
    }

    public static class PrinterThread extends Thread{
        @Override
        public void run() {
            System.out.println("run start");
            System.out.println("run is working");
            System.out.println("heheheh");
            System.out.println("run stop");
        }
    }
}
