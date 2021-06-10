package com.hillel.lesson3;

public class ReferenceTest {
    public static void main(String[] args) {
        DogF dog = new DogF();
        System.out.println(dog);

        DogF dog3 = new DogF();
        System.out.println(dog3);
        DogF dog4 = new DogF();
        System.out.println(dog4);
        DogF dog5 = dog;
        System.out.println(dog5);

    }
}
