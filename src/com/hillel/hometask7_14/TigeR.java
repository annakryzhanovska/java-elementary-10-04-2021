package com.hillel.hometask7_14;

public class TigeR extends AllAnimals implements Runnable, Climbable {
    String name;
    public TigeR(String name){
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
