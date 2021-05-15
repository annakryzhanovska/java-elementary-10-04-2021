package com.hillel.lesson3;

public class DogTest {
    public static void main(String[] args) {
        Dog jack = new Dog();
       jack.age= 3;
       jack.color= "white";
       jack.name = "Jack";
        jack.printInfo();
        Dog sam = new Dog();
        sam.age = 1;
        sam.name = "Sam";
        sam.length = 45.7f;
        sam.breed = "maltese";
    sam.printInfo();

    }
}
