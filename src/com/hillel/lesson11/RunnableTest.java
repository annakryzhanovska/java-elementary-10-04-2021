package com.hillel.lesson11;

public class RunnableTest {
    public static void main(String[] args) {
        Runnable printer = new Printer("Bob ");
        Thread thread = new Thread(printer);

        Runnable printer1 = new Printer("Ivan ");
        Thread thread1 = new Thread(printer1);
        thread.start();
        thread1.start();
        Thread thread2= new Thread(printer);
        Thread thread3= new Thread(printer);
        Thread thread4= new Thread(printer);

        thread2.start();
        thread3.start();
        thread4.start();
        System.out.println("main start");
        System.out.println("main is working");
        System.out.println("heheheh");
        System.out.println("main stop");

    }

    public static class Printer implements Runnable{
        String name;
        public Printer(String name){
            this.name = name;
        }
        @Override
        public void run() {
            System.out.println(name + "start");
            System.out.println(name + "is working");
            System.out.println(name + "stop");
        }
    }
}
