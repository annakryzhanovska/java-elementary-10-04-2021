package com.hillel.lesson11;

public class SwapTest {
    public static final Swapper SWAPPER = new Swapper();

    public static class Swapper extends Thread{
        String name = "Lena";
        String name2 = "Olya";
        public synchronized void swap(){
            String temp = name;
            name = name2;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            name2 = temp;
        }

        @Override
        public String toString() {
            return "Swap{" +
                    "name='" + name + '\'' +
                    ", name2='" + name2 + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(SWAPPER);
        Thread swapper1 = new SwapperThread();
        Thread swapper2 = new SwapperThread();
        swapper1.start();
        swapper2.start();

        swapper1.join();
        swapper2.join();
        System.out.println(SWAPPER);

    }

    public static class SwapperThread extends Thread{
        @Override
        public void run() {
            SWAPPER.swap();
        }
    }
}
