package com.hillel.hometask7_14;

public class DoG implements Flyable, Runnable, Climbable{
    String name;
    public DoG(String name){
        this.name = name;
    }
    @Override
    public void climb() {
        System.out.println("Dog " + name + " climbs");
    }

    @Override
    public void fly() {
        System.out.println("Dog " + name + " doesn't fly");
    }

    @Override
    public void run() {
        System.out.println("Dog " + name + " runs(?)");
    }
}
