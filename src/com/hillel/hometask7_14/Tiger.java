package com.hillel.hometask7_14;

public class Tiger extends Animal implements Runnable, Climbable {
    String name;
    public Tiger(String name){
        this.name = name;
    }
    @Override
    public void climb() {
        System.out.println("Tiger " + name + " climbs");
    }

    @Override
    public void run() {
        System.out.println("Tiger " + name + " runs");
    }
}
