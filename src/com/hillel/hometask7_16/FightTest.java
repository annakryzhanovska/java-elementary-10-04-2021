package com.hillel.hometask7_16;

public class FightTest {
    public static void main(String[] args) {
        Attacking attacking = new Attacking();
        Bodyguard bodyguard = createBodyGuard();
        bodyguard.saveClientLife(attacking);

    }

    public static Bodyguard createBodyGuard(){
        return new Boxer();
    }
}
