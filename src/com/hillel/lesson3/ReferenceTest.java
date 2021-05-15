package com.hillel.lesson3;

public class ReferenceTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);

        Dog dog3 = new Dog();
        System.out.println(dog3);
        Dog dog4 = new Dog();
        System.out.println(dog4);
        Dog dog5 = dog;
        System.out.println(dog5);

    }
}
