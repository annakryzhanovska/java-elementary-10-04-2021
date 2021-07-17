package com.hillel.hometask7_14;

public class CaT extends AllAnimals implements Runnable, Climbable{
    String name;
    public CaT(String name){
        this.name = name;
    }
    @Override
    public void climb() {
        System.out.println("Cat " + name + " climbs");
    }

    @Override
    public void run() {
        System.out.println("Cat " + name + " runs");
    }
}
