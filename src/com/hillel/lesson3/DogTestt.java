package com.hillel.lesson3;

public class DogTestt {
    public static void main(String[] args) {

        DogF bob = new DogF();
        bob.age = 3;
        bob.color = "white";
        bob.eat();
        bob.name = "Bob";
        bob.printInfo();

        System.out.println();

        DogF sharik = new DogF();
        sharik.lenght = 45.3F;
        sharik.breed = "malthese";
        sharik.name = "Sharik";
        sharik.printInfo();

        Stick stick = sharik.giveStick();
        System.out.println(sharik.name + " breought me " + stick.name);

    }
}
