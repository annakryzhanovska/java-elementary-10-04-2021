package com.hillel.hometask7_14;

public class CaT implements Flyable, Runnable, Climbable{
    String name;
    public CaT(String name){
        this.name = name;
    }
    @Override
    public void climb() {
        System.out.println("Cat " + name + " climbs");
    }

    @Override
    public void fly() {
        System.out.println("Cat " + name + " doesn't fly");
    }

    @Override
    public void run() {
        System.out.println("Cat " + name + " runs");
    }

}
