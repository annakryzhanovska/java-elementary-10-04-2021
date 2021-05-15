package com.hillel.lesson3;

public class Dog {

    String breed;
    float length;
    int age;
    String color;
    String name;

    void eat() {
        System.out.println("dog eats");
    }

    void sleep() {
        System.out.println("dog sleep");
    }



    Stick giveStick(){
        Stick stick = new Stick();
        stick.name = "my beautiful stick";
        stick.length = 10;
        return stick;
    }

    void printInfo(){
        System.out.println("Dog name: " + this.name);
        System.out.println("Dog age: " + this.age);
        System.out.println("Dog breed: " + this.breed);
        System.out.println("Dog color: " + this.color);
        System.out.println("Dog length: " + this.length);
    }


}