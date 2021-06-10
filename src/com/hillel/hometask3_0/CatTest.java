package com.hillel.hometask3_0;

public class CatTest {
    public static void main(String[] args) {
        Cat bob = new Cat("Bob", 2, 3);
        bob.toString();
        Cat molly = new Cat("Molly", 3, 5);
        molly.toString();



        System.out.println(bob == molly);

    }

}
