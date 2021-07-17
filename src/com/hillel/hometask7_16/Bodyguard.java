package com.hillel.hometask7_16;

public abstract class Bodyguard {
    public abstract void fight();

    public static void saveClientLife(Attacking attacking){
        if(attacking instanceof Gun){
            System.out.println("We are shooting");
        }
        Karate karate = new Karate();
        karate.fight();

        JiuJitsu jiuJitsu = new JiuJitsu();
        jiuJitsu.fight();

        Boxer boxer = new Boxer();
        boxer.fight();

    }
}
