package com.hillel.hometask7_16;

public abstract class Bodyguard {
    public abstract void fight();
    public void saveClientLife(Attacking attacking){
        if(attacking.getGun() == null){
            this.fight();
        }else {
            System.out.println("we are shooting");
        }

    }
}
