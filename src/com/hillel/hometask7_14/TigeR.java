package com.hillel.hometask7_14;

public class TigeR implements Flyable, Runnable, Climbable {
    String name;
    public TigeR(String name){
        this.name = name;
    }
    @Override
    public void climb() {
        System.out.println("Tiger " + name + " climbs");
    }

    @Override
    public void fly() {
        System.out.println("Tiger " + name + " doesn't fly");
    }

    @Override
    public void run() {
        System.out.println("Tiger " + name + " runs");
    }
}
